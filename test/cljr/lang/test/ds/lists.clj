(ns cljr.lang.test.ds.lists
  (:use cljr.lang.ds.lists)
  (:use [clojure.test]))

(def mylist (list 1 2 3 4 5))

;; create new list from the vector
(def list-2 (list*  [1 2 3 4 5]))

(def str-list (list "Jan" "Feb" "Mar"))

;; shortcut to create list which does not evaluate the items
(def non-eval-list '((+ 1 1) (+ 2 2) (+ 3 3)))

(def eval-list (list (+ 1 1) (+ 2 2) (+ 3 3)))

(deftest test-get-first
  (is (= 1 (get-first mylist)))
  (is (= "Jan" (get-first str-list)))
  (is (= 2 (peek eval-list)))
  (is (= 2 (eval (peek non-eval-list))))
  (is (list? non-eval-list))
  (is (= 1 (first list-2))))

(deftest test-list-peek
  (is (= 1 (peek mylist))))

(deftest test-list-pop
  (is (= 4 (count (pop mylist)))))

(deftest test-get-first-by-peek
  (is (= 4 (peek (pop eval-list)))))

(deftest test-put-item-front
  (is (= 9 (peek (put-item-front '(8 7 6 5 4 3 2 1) 9)))))
