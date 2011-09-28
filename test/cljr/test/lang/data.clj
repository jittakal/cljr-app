(ns cljr.test.lang.data
  (:use [cljr.lang.data])
  (:use [clojure.test]))

(deftest test-str-conc
  (is (. "Jitendra Baban Takalkar" String/equals (str-conc "Jitendra" "Baban" "Takalkar"))))
