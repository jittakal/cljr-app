(ns cljr.lang.dt.datatype
  (:use [cljr.lang.dt.protocol]))

(defrecord Customer [fname lname]
  SampleHttp ;; Implement Sample HTTP protocol 
  (do-get [this request]
    ;; (println (:uri request))
    {:status 200
      :body (str "GET - Customer : " lname ", " fname)})
  (do-post [this request]
    {:status 200
      :body (str "POST - Customer : " lname ", " fname)})
  Stack  ;; Implement Stack protocol
  (push-into [this coll item]
    (cons coll item))
  (pop-off [this coll]
    (pop coll))
  (get-first [this coll]
    (peek coll)))

;; Extending protocols to preexisting datatypes

(defrecord Employee [^String fname ^String lname ^Integer empid manager])

;; use of deftype instead of defrecord

(deftype EmployeeDao [])

(extend EmployeeDao
  BaseDao
  {:get-by-id (fn [this ^String id]
                (Employee. "Jitendra" "Takalkar" id
                           (Employee. "Amit" "Mitra" 1369 nil)))
   :get-all (fn [this]
              [(Employee. "Jitendra" "Takalkar" 8546 nil)
               (Employee. "Abc" "Xyz" 1234 nil)])})

;; Default implementation for protocol

(def default-SampleProtocol
  {:method-one (fn [this]
                 (.toString this))})

(extend EmployeeDao
  SampleProtocol
  default-SampleProtocol)

;; Use of extend-type to extend datatype with one ot more protocols
(deftype CustomerDao [])

(extend CustomerDao
  SampleProtocol
  default-SampleProtocol)

(extend-type CustomerDao  
  AnotherProtocol
  (method-two [this]
    (str "Hello " "World!")))


;; Use of extend-protocol to impelement same protocol to one or more datatypes
(deftype AddressDao [])
(deftype StreetDao [])

(extend-protocol AnotherProtocol
  AddressDao
  (method-two [this]
    (str "Hello " "World!"))
  StreetDao
  (method-two [this]
    (str "Hello " "World!")))

;; extend Java Interface
(defrecord Person [^{:tag String} name ^Integer age]
  java.lang.Comparable
  (compareTo [this other]
    (compare age (:age other))))

;; extend Java Class
(deftype Human []
  java.lang.Object
  (toString [this]
    "Human"))

;; reifying anonymous datatypes - inner classes in Java
(def temp-tos (let [s "Sample toString"]
              (reify
                java.lang.Object
                (toString [this] s))))



