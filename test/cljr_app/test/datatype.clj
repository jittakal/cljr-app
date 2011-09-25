(ns cljr-app.test.datatype
  (:use [cljr-app.datatype])
  (:use [clojure.test]))

;;(def customer-request {:uri "/customer/get/0001"})
;;(def customer-response {:status 401})
;;(deftest test-customer-doget
;;  (is (= 200 (:status
;;              (.doGet cljr-app.datatype/customer
;;                      customer-request
;;                      customer-response)))))