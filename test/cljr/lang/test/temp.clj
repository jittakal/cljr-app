(ns cljr.lang.test.temp
  (:use [cljr.lang.temp])
  (:use [clojure.test]))

(deftest test-what-is-count
  (is (== 5 (what-is-count 1 2 3 4 5))))
