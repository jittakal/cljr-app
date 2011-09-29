(ns cljr.test.lang.lb.binding
  (:use [cljr.lang.lb.binding])
  (:use [clojure.test]))

(deftest test-seconds-to-weeks
  (is (= 1/10080 (seconds-to-weeks-v1 60)))
  (is (= 1/10080 (seconds-to-weeks-v2 60))))

