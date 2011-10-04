(ns cljr.test.lang.mh.multimethod
  (:use [cljr.lang.mh.multimethod])
  (:use [clojure.test]))

(def a {:name "Arthur" :species  "human" :strength 8})
(def b {:name "Balfor" :species  "elf" :strength 7})
(def c {:name "Calis" :species "elf" :strength 5})
(def d {:name "Drung" :species "orc" :strength 6})

(deftest test-move
  (is (. (move a) String/equals "Arthur walks steadily."))
  (is (. (move b) String/equals "Balfor runs swiftly."))
  (is (. (move c) String/equals "Calis runs swiftly."))
  (is (. (move d) String/equals "Drung stomps heavily.")))

(deftest test-attack
  (is (. (attack c) String/equals "Calis attacks feebly."))
  (is (. (attack d) String/equals "Drung attacks mightily.")))

(deftest test-encounter
  (is (. (encounter b c) String/equals "Two elves, Balfor and Calis, greet each other."))
  (is (. (encounter d b) String/equals "Evil orc Drung attacks innocent elf Balfor"))
  (is (. (encounter a c) String/equals "Arthur and Calis ignore each other.")))

(deftest test-talk
  (is (. (talk d) String/equals "Drung grunts."))
  (is (. (talk a) String/equals "Arthur speaks.")))

(def ab {:rettype "yorn" :val true})
(def ac {:rettype "torf" :val false})
(def ad {:rettype "1or0" :val true} )

(deftest test-get-character
  (is (= \Y (get-character ab)))
  (is (= \F (get-character ac)))
  (is (= \1 (get-character ad))))

(deftest test-manager-employee-herarchy
  (is (isa? :cljr.lang.mh.multimethod/manager :cljr.lang.mh.multimethod/employee)))
