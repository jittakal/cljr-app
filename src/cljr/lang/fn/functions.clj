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
