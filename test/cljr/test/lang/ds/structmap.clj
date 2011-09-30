(ns cljr.test.lang.ds.structmap
  (:use [cljr.lang.ds.structmap])
  (:use [clojure.test]))

(def cust-jitendra (struct-map cust-struct-map :fname "Jitendra"
                               :lname "Takalkar"
                               :address "Ordrupvej 2920"))

(deftest test-customer
  (is (. "Jitendra" String/equals (get-fname cust-jitendra)))
  (is (. "Takalkar" String/equals (get-lname cust-jitendra)))
  (is (. "Ordrupvej 2920" String/equals (get-address cust-jitendra))))