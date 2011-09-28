(ns cljr.lang.fn.functions)

;; define functions with fn
(def my-mult
  (fn [x y] (* x y)))

;; define functions with defn

(defn square
  "Squares the provided argument"
  [x]
  (* x x))

;; functions of multiple arities

(defn square-or-multiply
  "Square a single argument, multiplies two argument"
  ([] 0)
  ([x] (* x x))
  ([x y] (* x y)))

;; functions with variable arguments

(defn add-arg-count
  "Returns the first argument + the number of additional arguments"
  [first & more]
  (+ first (count more)))

;; shorthand function declaration

(def sq #(* % %))

(def multiply #(* %1 %2))

;; if conditional expression
(defn find-max
  "return max number from two arguments"
  [num1 num2]
  (if (> num1 num2)
    num1
    num2))

;; if-not conditonal expression
(defn find-min
  "return min mumber from two arguments"
  [num1 num2]
  (if-not (> num1 num2)
    num1
    num2))

;; cond conditional expression
(defn weather-judge
  "Given a temprature in degrees centigrade, comments on the weather."
  [temp]
  (cond
   (< temp 20) "It's cold"
   (> temp 25) "It's hot"
   :else "It's comfortable"))

