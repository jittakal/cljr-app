(ns cljr-app.test.macro
  (:use [cljr-app.macro])
  (:use [clojure.test]))

(def test-sum-1
  (is (zero? (sum))))

(def test-sum-2
  (is (= 20 (sum 10 10))))

(def test-sum-3
  (is (= 30 (sum 10 10 10))))

(def test-average-1
  (is (= 10 (average 10 10 10))))

(def test-average-2
  (is (= 29/2 (average 14 15))))