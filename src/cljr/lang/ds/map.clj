(ns ^{:author "Jitendra Takalkar jitendra.takalkar@gmail.com"
      :doc "Sample functions to explore more on map data structure"}
  cljr.lang.ds.map)
;; A map is a collection thats maps keys and values.

;; Create a new map
;; The default map is of type hash-map
(def d-map {:a 1 :b 2 :c 3}) 

;; create simple map using hash-map
(def h-map (hash-map :a 1 :b 2 :c 3))

;; create sorted map using sorted-map
;; default sorting will be by ascending order of keys
(def s-map (sorted-map :c 3 :b 2 :a 1))

;; create sorted map using 


