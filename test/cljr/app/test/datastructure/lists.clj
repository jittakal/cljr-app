(ns cljr.app.test.datastructure.lists
  (:use cljr.app.datastructure.lists)
  (:use [clojure.test]))

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