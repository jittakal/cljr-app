(ns ^{:doc "Sample thread test methods"
      :author "Jitendra Takalkar"}
  cljr.test.lang.fn.thread
  (:use [clojure.test])
  (:use [cljr.lang.fn.thread]))

(deftest test-thread-test
  (is (= 0 (first (thread-test)))))


