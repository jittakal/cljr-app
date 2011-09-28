(ns cljr.test.lang.lr.recursions
  (:use [cljr.lang.lr.recursions])
  (:use [clojure.test]))

(deftest test-factorial
  (is (= 6 (factorial 3)))
  (is (= 1 (factorial 0))))

(deftest test-fib
  (is (= 3 (fib 4)))
  (is (= 5 (fib 5))))

(deftest test-abs
  (is (= 1 (abs 1)))
  (is (= 2 (abs -2))))

(deftest test-avg
  (is (= 15 (avg 15 15)))
  (is (= 29/2 (avg 14 15))))

(deftest test-sqrt
  (is (= 5.000023178253949 (sqrt 25))))

(deftest test-gcd
  (is (= 9 (gcd 27 9)))
  (is (= 37 (gcd 259 111))))
