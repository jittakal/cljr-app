(ns cljr.test.lang.dt.datatype
  (:use [cljr.lang.dt datatype protocol])
  (:use [clojure.test])
  (:import (cljr.lang.dt.datatype Customer Employee EmployeeDao)))

(def cust (Customer. "Jitendra" "Takalkar"))
(def creq {:uri "/customer/get/0001"})

(deftest test-customer-doget
  (is (= 200 (:status
              (do-get cust creq)))))

(deftest test-customer-dopost
  (is (= 200 (:status
              (do-post cust creq)))))

(deftest test-emp-get-by-id
  (is (= "Jitendra" (:fname (get-by-id (EmployeeDao.) 8546)))))

(deftest test-default-sample-protocol
  (is (not= "EmployeeDao" (method-one (EmployeeDao.)))))
