(ns cljr-app.test.data
  (:use [cljr-app.data])
  (:use [clojure.test]))

(def test-str-conc
  (is (. "Jitendra Baban Takalkar" String/equals (str-conc "Jitendra" "Baban" "Takalkar"))))