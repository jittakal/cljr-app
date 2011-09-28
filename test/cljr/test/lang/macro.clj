(ns cljr.test.lang.macro
  (:use [cljr.lang.macro])
  (:use [clojure.test]))

(deftest test-sum-1
  (is (zero? (sum))))

(deftest test-sum-2
  (is (= 20 (sum 10 10))))

(deftest test-sum-3
  (is (= 30 (sum 10 10 10))))

(deftest test-average-1
  (is (= 10 (average 10 10 10))))

(deftest test-average-2
  (is (= 29/2 (average 14 15))))
