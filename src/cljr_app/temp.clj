(ns cljr-app.temp)

(defn what-is-count
  "This function returns the count of the list"
  [x & lst]
  (inc (count lst)))

;; How to debug in clojure
(use 'clojure.contrib.trace)
(defn fib
  [n]
  (if (< n 2)
    n
    (+ (fib (- n 1 )) (fib (- n 2)))))
;; (dotrace [fib] (fib 3))