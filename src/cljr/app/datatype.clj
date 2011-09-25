(ns cljr.app.datatype
  (:use [cljr.app.protocol]))

(defrecord Customer [fname lname]
  Http
  (doGet [request response]
    (assoc response {:status 200
                     :body (str "GET - Customer : "
                                lname
                                ", "
                                fname)}))
  (doPost [request response]
    (assoc response {:status 200
                     :body (str "POST - Customer : "
                                lname
                                ", "
                                fname)})))

(def customer (Customer. "Jitendra" "Takalkar"))
(def customer-request {:uri "/customer/get/00001"})
(def customer-response {:status 401})
;;(doGet customer customer-request customer-response)
