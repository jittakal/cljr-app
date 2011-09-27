(ns cljr.lang.test.core
  (:use [cljr.lang.core])
  (:use [clojure.test]))

(deftest test-say-hello
  (is (. "Hello Jitendra" String/equals (say-hello "Jitendra")) "test-say-hello failed"))
