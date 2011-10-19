(ns cljr.lang.cn.common)

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


;; Utility method to convert the html tags into hiccup framework format
;; Vector and map format
;; e.g.
;; 1) I/P => <div>Hello World!</div>
;;    O/P => [:div "Hello World!"]
;;
;; 2) I/P => <div id="main" class="container">
;;             <div id="submain" class="content">Hello World!</div>
;;           </div>
;;    O/P => [:div {:id "main" :class "container"}
;;             [:div {:id "submain" :class "content"}
;;               "Hello World!"]]
