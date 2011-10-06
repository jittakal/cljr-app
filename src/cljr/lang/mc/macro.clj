(ns cljr.lang.mc.macro)

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



(defmacro unless
  "sample macro smillar to when-not"
  [expr form]
  `(if ~expr nil ~form))

;;(macroexpand '(unless false (println "Hello World")))

(defmacro wrap-in-div
  "sample macro wrap the content in div element."
  [id class style & body]
  `(str "<div id=\"" ~id "\" class=\"" ~class "\" style=\"" ~style "\">" ~@body "</div>"))

;;(macroexpand '(wrap-in-div "header" "span-24" "" "<p>Hello World" "!!!</p>"))
;;(wrap-in-div "header" "span-24" "" "<p>Hello World" "!!!</p>")

(defmacro when-nt
  "sample macro simillar to when-not"
  [expr & body]
  `(if ~expr nil (do ~@body)))

;;(macroexpand '(when-nt false (println "Hello ") (println "World!!!")))
;;(when-nt false (println "Hello ") (println "World!!"))




