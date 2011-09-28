(ns cljr.test.lang.fn.functions
  (:use [cljr.lang.fn.functions])
  (:use [clojure.test]))

(deftest test-my-mult
  (is (= 4 (my-mult 2 2)))
  (is (= 50 (my-mult 10 5))))

(deftest test-square
  (is (= 625 (square 25)))
  (is (= 225 (square -15))))

(deftest test-square-or-multiply
  (is (= 0 (square-or-multiply)))
  (is (= 625 (square-or-multiply 25)))
  (is (= 100 (square-or-multiply 10 10))))

(deftest test-add-arg-count
  (is (= 5 (add-arg-count 5)))
  (is (= 6 (add-arg-count 5 5)))
  (is (= 7 (add-arg-count 5 5 5))))

(deftest test-sq
  (is (= 25 (sq 5)))
  (is (= 25 (sq -5))))

(deftest test-multiply
  (is (= 25 (multiply 5 5)))
  (is (= -10 (multiply -5 2))))