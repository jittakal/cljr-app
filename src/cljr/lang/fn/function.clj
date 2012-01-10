(ns ^{:author "Jitendra Takalkar jitendra.takalkar@gmail.com"
      :doc "Sample for functions"}
  cljr.lang.fn.function)

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

(defn get-boolean [c]
  "return true if character is one of the T t Y y 1 and false F f N n 0"
  (cond
   (some #(= c %) '(\T \t \Y \y \1)) true
   (some #(= c %) '(\F \f \N \n \0)) false
   :else false))

(defn greeting
  "Returns a greeting of the form 'Hello, username' defaul is world"
  ([] "Hello, World!")
  ([username] (str "Hello, " username "!")))

;; destructuring form.
;; clojure supports abstract structural binding often refered as destructuring form

(defn dstruct-sample-1
  "Sample using destructing form"
  [{name :name}]
  (str "Hello, " name))

(defn dstruct-sample-2
  "Sample using destructring form"
  [{{name "name"} :param}]
  (str "Hello, Jitendra"))

(defn dstruct-sample-3
  "Sample using destructring form"
  [[x y]]
  (+ x y))

(defn print-down-from
  "Print down from number to zero"
  [^Integer x]
  (when (pos? x) ;; use of 'when' implicit do block
    (println x)
    (recur (dec x)))) ;; recursive function

;; (print-down-from 5)

(defn sum-down-from
  "Sum down from number till zero"
  [^Integer sum ^Integer x]
  {:pre (pos? x)}
  (if-not (pos? x)
    sum
    (recur (+ sum x) (dec x))))