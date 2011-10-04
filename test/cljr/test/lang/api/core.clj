(ns cljr.test.lang.api.core
  (:use [cljr.lang.api.core])
  (:use [clojure.test]))

(deftest test-say-hello
  (is (. "Hello Jitendra" String/equals (say-hello "Jitendra")) "test-say-hello failed"))
