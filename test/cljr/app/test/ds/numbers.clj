;; Test class for numbers datastructure usage

(ns cljr.app.test.ds.numbers
  (:use cljr.app.ds.numbers)
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
(deftest test-divd-1
  (is (= 5 (/ 25 5))))

(deftest test-divd-2
  (is (= 29/2 (/ 29 2))))

;; inc
(deftest test-inc-1
  (is (= 10 (inc 9))))

(deftest test-inc-2
  (is (= 0 (inc -1))))

