(ns cljr-app.test.core
  (:use [cljr-app.core])
  (:use [clojure.test]))

(deftest test-say-hello
  (is (. "Hello Jitendra" String/equals (say-hello "Jitendra")) "test-say-hello failed"))
