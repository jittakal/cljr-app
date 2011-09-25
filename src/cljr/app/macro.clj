(ns cljr.app.macro)

(defmacro tripple-do
  "evaluates the expression three times"
  [form]
  (list 'do form form form))


;;Debugging Macros
;;(macroexpand '(tripple-do (println "Hello Jitendra")))

(defmacro infix
  "rewrites an infixed mathematical expression"
  [form]
  (cons (second form) (cons (first form) (nnext form))))

(defn sum
  "return the sum of zero or more numbers"
  ([] 0)
  ([x] x)
  ([x & more] (+ x (apply sum more))))
  
(defn average
  "calculate average of zero or more numbers"
  ([] 0)
  ([x] x)
  ([x & more] (/ (+ x (apply sum more))
                 (inc (count more)))))
