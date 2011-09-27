(ns cljr.lang.recur)

(defn factorial
  "recursive function used to calculate the factorial of a natural number"
  [n]
  (if (zero? n) ;; base condition of recursive function
    1
    (* n (factorial (dec n)))))

(defn abs
  "calculates the absolute value of a number"
  [n]
  (if (< n 0)
    (* -1 n)
    n))

(defn avg
  "calculate the average of two numbers"
  [x y]
  (/ (+ x y) 2))

(defn good-enough?
  "test if a guess number is close enough to the real square root"
  [number guess]
  (let [diff (- (* guess guess) number)]
    (if (< (abs diff) 0.001)
      true
      false)))

(defn sqrt
  "returns the square root of the supplied number"
  ([number] (sqrt number 1.0))
  ([number guess]
     (if (good-enough? number guess)
       guess
       (sqrt number (avg guess (/ number guess))))))

(defn fib
  "recursive function that computes the fibonacci numbers"
  [n]
  (cond
   (zero? n) 0
   (= n 1) 1
   :else (+ (fib (dec n)) (fib (- n 2)))))

(defn gcd
  "recursive function to compute the greatest common division og two integers"
  [x y]
  (if (zero? y)
    x
    (gcd y (rem x y))))
