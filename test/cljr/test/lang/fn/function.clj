(ns cljr.test.lang.fn.function
  (:use [cljr.lang.fn.function])
  (:use [clojure.test]))

(deftest test-my-mult
  (is (= 4 (my-mult 2 2)))
  (is (= 50 (my-mult 10 5))))

(deftest test-square
  (is (= 625 (square 25)))
  (is (= 225 (square -15))))

(deftest test-square-or-multiply
  (is (= 0 (square-or-multiply)))
  (is (= 625 (square-or-multiply 25)))
  (is (= 100 (square-or-multiply 10 10))))

(deftest test-add-arg-count
  (is (= 5 (add-arg-count 5)))
  (is (= 6 (add-arg-count 5 5)))
  (is (= 7 (add-arg-count 5 5 5))))

(deftest test-sq
  (is (= 25 (sq 5)))
  (is (= 25 (sq -5))))

(deftest test-multiply
  (is (= 25 (multiply 5 5)))
  (is (= -10 (multiply -5 2))))

(deftest test-find-max
  (is (= 12 (find-max 10 12))))

(deftest test-find-min
  (is (= 10 (find-min 10 12))))

(deftest test-weather-judge
  (is (. "It's cold" String/equals (weather-judge 19)))
  (is (. "It's hot" String/equals (weather-judge 26)))
  (is (. "It's comfortable" String/equals (weather-judge 23))))

(deftest test-get-boolean
  (is (= true (get-boolean \T)))
  (is (= false (get-boolean \F)))
  (is (= false (get-boolean \C))))

(deftest test-greeting
  (is (= "Hello, World!" (greeting)))
  (is (= "Hello, Jitendra!" (greeting "Jitendra"))))


