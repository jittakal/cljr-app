(ns cljr.lang.lb.binding)

;; local bindings
(defn seconds-to-weeks-v1
  "Converts seconds to weeks"
  [seconds]
  (/ (/ (/ (/ seconds 60) 60) 24) 7))

(defn seconds-to-weeks-v2
  "Converts seconds to weeks using let form"
  [seconds]
  (let [minutes (/ seconds 60)
        hours (/ minutes 60)
        days (/ hours 24)
        weeks (/ days 7)]
    weeks))

(defn skip-start-elements
  "Binging using let to skip starting elements"
  []
  (let [[_ _ z] [1 2 3]] z))

;; Bind both a collection and elements within the collection.

(defn bind-collection
  []
  (let [[x y :as coords] [1 2 3 4 5 6]]
    (str "x: " x " y: " y ", total dimensions " (count coords))))

