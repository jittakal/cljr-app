(ns cljr.lang.ds.structmap)

;; define struct map
(defstruct cust-struct-map
  :fname
  :lname
  :address)

;; define accessor methods for struct map
;; more faster than map key based lookup

(def get-fname (accessor cust-struct-map :fname))
(def get-lname (accessor cust-struct-map :lname))
(def get-address (accessor cust-struct-map :address))