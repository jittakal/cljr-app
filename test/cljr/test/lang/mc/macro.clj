(ns cljr.test.lang.mc.macro
  (:use [cljr.lang.mc.macro])
  (:use [clojure.test]))

(deftest test-sum
  (is (zero? (sum)))
  (is (= 20 (sum 10 10)))
  (is (= 30 (sum 10 10 10))))

(deftest test-average
  (is (= 10 (average 10 10 10)))
  (is (= 29/2 (average 14 15))))
