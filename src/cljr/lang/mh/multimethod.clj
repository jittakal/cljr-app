(ns cljr.lang.mh.multimethod)

;; multimethod with single dispatch value.
(defmulti move :species)

(defmethod move "elf" [creature]
  (str (:name creature)
       " runs swiftly."))

(defmethod move "human" [creature]
  (str (:name creature)
       " walks steadily."))

(defmethod move "orc" [creature]
  (str (:name creature)
       " stomps heavily."))

;; multimethod with dispatch value based on some conditional logic
(defmulti attack (fn [creature]
                   (if (> (:strength creature) 5)
                     :strong
                     :weak)))

(defmethod attack :strong [creature]
  (str (:name creature) " attacks mightily."))

(defmethod attack :weak [creature]
  (str (:name creature) " attacks feebly."))

;; multimethod with multiple dispatch value
(defmulti encounter (fn [x y]
                      [(:species x) (:species y)]))

(defmethod encounter ["elf" "orc"] [elf orc]
  (str "Brave elf " (:name elf) " attacks evil orc " (:name orc)))

(defmethod encounter ["orc" "elf"] [orc elf]
  (str "Evil orc " (:name orc) " attacks innocent elf " (:name elf)))

(defmethod encounter ["elf" "elf"] [elf1 elf2]
  (str "Two elves, " (:name elf1) " and " (:name elf2)
       ", greet each other."))

;; default dispatch values
(defmethod encounter :default [x y]
  (str (:name x) " and " (:name y)
       " ignore each other."))

;; alternate approch to define the default dispatcher value in defmulti
(defmulti talk :species :default "other")

(defmethod talk "orc" [creature]
  (str (:name creature) " grunts."))

(defmethod talk "other" [creature]
  (str (:name creature) " speaks."))



(defmulti get-character :rettype)

(defmethod get-character "yorn" [bval]
  (if (true? (:val bval))
    \Y
    \N))

(defmethod get-character "torf" [bval]
  (if (true? (:val bval))
    \T
    \F))

(defmethod get-character "1or0" [bval]
  (if (true? (:val bval))
    \1
    \0))




;; herarchies -> (derive child parent)

(derive ::manager ::employee)

