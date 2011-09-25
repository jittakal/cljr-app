(ns cljr.app.test.temp
  (:use [cljr.app.temp])
  (:use [clojure.test]))

(deftest test-what-is-count
  (is (== 5 (what-is-count 1 2 3 4 5))))
