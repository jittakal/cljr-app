(ns cljr.app.datastructure.lists)

(def mylist (list 1 2 3 4 5))

;; create new list from the vector
(def list-2 (list*  [1 2 3 4 5]))

(def str-list (list "Jan" "Feb" "Mar"))

;; shortcut to create list which does not evaluate the items
(def non-eval-list '((+ 1 1) (+ 2 2) (+ 3 3)))

(def eval-list (list (+ 1 1) (+ 2 2) (+ 3 3)))

(defn get-first
  "This function will return the first element of list"
  [list]
  (first list))

(defn get-first-bypeek
  "More efficient to get first element"
  [list]
  (peek list))

(defn get-rest
  "This function will return all elements escape first element"
  [list]
  (rest list))