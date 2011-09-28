(ns cljr.test.lang.refs
  (:use [cljr.lang.refs])
  (:use [clojure.test]))

(def account1 (ref 1000))
(def account2 (ref 2000))

(deftest test-transfer-1
  (transfer account1 account2 500)
  (is (and (= @account1 500) (= @account2 2500))))

(deftest test-transfer-2
  (transfer account2 account1 500)
  (is (and (= @account1 1000) (= @account2 2000))))

(def my-contacts (ref []))

(deftest test-add-contact-1
  (add-contact my-contacts {:fname "Jitendra" :lname "Takalkar"})
  (print-contacts-with-initials my-contacts)
  (is (= 1 (count @my-contacts))))

