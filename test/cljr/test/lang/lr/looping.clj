(ns cljr.test.lang.lr.looping
  (:use [cljr.lang.lr.looping])
  (:use [clojure.test]))


(deftest test-sample-loop-1
  (is (= 5 (first (sample-loop-1)))))

(deftest test-sample-loop-2
  (is (= 10 (count (sample-loop-2)))))

(deftest test-countedown
  (is (= 5 (first (countdown [] 5)))))

(deftest test-get-arguments
  (is (. "p1=v1&p2=v2&" String/equals (get-arguments {"p1" "v1" "p2" "v2"}))))

