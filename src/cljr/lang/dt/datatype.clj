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


