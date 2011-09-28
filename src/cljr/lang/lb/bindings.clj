(ns cljr.lang.lb.bindings)

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
