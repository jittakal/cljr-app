(ns cljr.test.lang.ds.vector
  (:use cljr.lang.ds.vector)
  (:use [clojure.test]))

;; create vector
;; define vector using function
(def first-vector (vector 1 2 3 4 5))

;; shortcut way to define vector
(def second-vector (vector 10 20 30 40 50))

;; convert any other collection to vecotr
(def list-to-vector (vec '(11 12 13 14 15)))

;; define vector speific to primitiv
(def vector-of-int (vector-of :int 21 22 23 24 25))

;; examine a vector

(deftest test-get
  (is (= 3 (get first-vector 2)))
  (is (= 5 (get first-vector (dec (count first-vector)))))
  (is (= 10 (get second-vector 0))))

(deftest test-nth
  (is (= 25 (nth vector-of-int 4))))

(deftest test-peek
  (is (= 50 (peek second-vector))))

(deftest test-rseq
  (is (= 50 (first (rseq second-vector)))))

(deftest test-vector?
  (is (vector? vector-of-int)))

;; 'change' a vector

(deftest test-assoc
  (is (= 6 (count (assoc first-vector 5 6)))))

(deftest test-pop
  (is (= 4 (count (pop first-vector)))))

(deftest test-subvec
  (is (= 4 (peek (subvec first-vector 1 4)))))

(deftest test-replace
  (is (= 3 (nth (replace first-vector [1 2 3]) 1))))

