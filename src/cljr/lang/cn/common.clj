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

(defn html-to-hiccup
  "Parse the html containing in file and convert into the
   hiccup framework format html, support only one level"
  [^String fname]
  (let [xmap (xml/parse fname)]
    (loop [s "" tmap xmap cvec (:content tmap)]
      (if (empty? tmap)
        (str s "]")
        (recur (str s
                    (if (map? tmap)
                      (str "[" (:tag tmap) " " (:attrs tmap) " "))
                    (if (string? (first cvec))
                      (str " \"" (first cvec) "\"] ")))
               (first cvec) [])))))


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

(defn temp-fn
  [s v]
  (loop [ts s tv v]
    ;;(println "ts =>" ts)
    ;;(println "tv => " tv)
    (cond (empty? tv) ts
          :else (recur (str ts (peek tv) " ") (pop tv)))))

