(ns cljr.test.lang.recur
  (:use [cljr.lang.recur])
  (:use [clojure.test]))

(deftest test-factorial-1
  (is (= 6 (factorial 3))))

(deftest test-factorial-2
  (is (= 1 (factorial 0))))

(deftest test-fib-1
  (is (= 3 (fib 4))))

(deftest test-fib-2
  (is (= 5 (fib 5))))

(deftest test-abs-1
  (is (= 1 (abs 1))))

(deftest test-abs-2
  (is (= 2 (abs -2))))

(deftest test-avg-1
  (is (= 15 (avg 15 15))))

(deftest test-avg-2
  (is (= 29/2 (avg 14 15))))

(deftest test-sqrt-1
  (is (= 5.000023178253949 (sqrt 25))))

(deftest test-gcd-1
  (is (= 9 (gcd 27 9))))

(deftest test-gcd-2
  (is (= 37 (gcd 259 111))))
