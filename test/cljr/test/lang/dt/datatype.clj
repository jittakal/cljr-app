(ns cljr.test.lang.dt.datatype
  (:use [cljr.lang.dt datatype protocol])
  (:use [clojure.test])
  (:import (cljr.lang.dt.datatype Customer Employee Person Human
                                  EmployeeDao CustomerDao
                                  AddressDao StreetDao)))

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

(deftest test-default
  (is (not= "EmployeeDao" (method-one (EmployeeDao.)))))

(deftest test-extend-type
  (is (= "Hello World!" (method-two (CustomerDao.))))
  (is (not= "CustomerDao" (method-one (CustomerDao.)))))

(deftest test-extend-protocol
  (is (= "Hello World!" (method-two (AddressDao.))))
  (is (= "Hello World!" (method-two (StreetDao.)))))

(deftest test-extend-jinterface
  (is (.compareTo (Person. "Abc" 20) (Person. "Xyz" 30))))

(deftest test-extend-jclass
  (is (.toString (Human.))))

(deftest test-reify
  (is (= "Sample toString" (str cljr.lang.dt.datatype/temp-tos))))
