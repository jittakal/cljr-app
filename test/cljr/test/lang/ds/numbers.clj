;; Test class for numbers datastructure usage

(ns cljr.test.lang.ds.numbers
  (:use cljr.lang.ds.numbers)
  (:use [clojure.test]))

;; test cases for computation functions
;; + - * / inc dec quot rem min max
;; +
(deftest test-add
  (is (= 10 (+ 1 1 1 1 1 1 1 1 1 1))))

;; -
(deftest test-sub
  (is (= 5 (- 10 1 1 1 1 1))))

;; *
(deftest test-mult
  (is (= 25 (* 5 5))))

;; /
(deftest test-divd
  (is (= 5 (/ 25 5)))
  (is (= 29/2 (/ 29 2))))

;; inc
(deftest test-inc
  (is (= 10 (inc 9)))
  (is (= 0 (inc -1))))

