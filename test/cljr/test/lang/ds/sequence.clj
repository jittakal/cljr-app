(ns cljr.test.lang.ds.sequence
  (:use [cljr.lang.ds.sequence])
  (:use [clojure.test]))

(def map-result (map sqr '(1 2 3 4 5 6 7 8 9)))

(deftest test-sqr
  (is (= 9 (nth map-result 2))))

(deftest test-lazy-counter
  (is (= 0 (first (take 10 (lazy-counter 0 2)))))
  (is (= 3000002 (nth (lazy-counter 2 3) 1000000))))