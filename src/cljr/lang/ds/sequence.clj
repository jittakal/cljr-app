(ns cljr.lang.ds.sequence)

;; using sequence
(defn printall [s]
  "Print all the elements of sequece"
  (if (not (empty? s))
    (do
      (println (str "Item: " (first s)))
      (recur (rest s)))))

;; (def mylist '(1 2 3))
;; (printall mylist)

;; lazy sequence
(defn sqr [x]
  (do
    ;;(println (str "Processing: " x))
    (* x x)))

;;(def map-result (map sqr '(1 2 3 4 5 6 7 8 9)))
;;(nth map-result 2)

;; Constructing lazy sequence

(defn lazy-counter [base increment]
  (lazy-seq
   (cons base (lazy-counter (+ base increment) increment))))