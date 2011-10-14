(ns cljr.test.lang.api.core
  (:use [cljr.lang.api.core])
  (:use [clojure.test]))

(deftest test-say-hello
  (is (. "Hello Jitendra" String/equals (say-hello "Jitendra")) "test-say-hello failed"))

(deftest test-say-hi
  (is (= "Hello, Jitendra Takalkar" (apply say-hi '("Jitendra" "Takalkar")))))

(deftest test-only-even
  (is (= 2 (first (only-even '(1 2 3 4 5 6 7 8 9))))))
