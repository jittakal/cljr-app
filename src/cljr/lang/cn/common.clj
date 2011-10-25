(ns cljr.lang.cn.common
  (:use [clojure.xml :as xml])
  (:use [clojure.contrib.trace]))

(defn what-is-count
  "This function returns the count of the list"
  [x & lst]
  (inc (count lst)))

;; How to debug in clojure
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

(defn traverse-xmap
  "Iterate the map of xml node is recursive function. DOM parsing approach."
  [xmap]
  (if (empty? (:content xmap))
    (print (str "[" (:tag xmap) " " (:attrs xmap)))
    (do
      (print (str "[" (:tag xmap) " " (:attrs xmap)))
      (loop [cvec (:content xmap)]        
        (if (empty? cvec)
          (print (str "]"))
          (recur (do (if (map? (first cvec))
                       (traverse-xmap (first cvec))
                       (print (str "\"" (first cvec) "\"")))
                     (subvec cvec 1))))))))

(defn parse-file
  "Parse XML file containing HTML tag and print the hiccup framework
   html tag represemtation
   :Cons If nested tags are more then it may throw outofmemory error."
  [^String fname] ;; file name
  (traverse-xmap (xml/parse fname)))

;; (traverse-xmap (xml/parse "shtml.xml"))


;; Sample for nested for loop

(defn nested-loop
  "Simple function to explore nested looping"
  []
  (loop [s ""  v [[1 2] [2 3] [4 5]]]
    (if (empty? v)
      s
      (recur (str s "+"
                  (loop [is "" vi (peek v)]
                    (if (empty? vi)
                      is
                      (recur (str is "#") (pop vi))))) (pop v)))))
