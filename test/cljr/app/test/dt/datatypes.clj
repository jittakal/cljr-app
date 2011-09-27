(ns cljr.app.test.dt.datatypes
  (:use [cljr.app.dt datatypes protocols])
  (:use [clojure.test])
  (:import (cljr.app.dt.datatypes Customer)))

(def cust (Customer. "Jitendra" "Takalkar"))
(def creq {:uri "/customer/get/0001"})
(def cres {:status 401})

(deftest test-customer-doget
  (is (= 200 (:status
              (do-get cust creq cres)))))

(deftest test-customer-dopost
  (is (= 200 (:status
              (do-post cust creq cres)))))
