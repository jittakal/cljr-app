(ns cljr.lang.test.multimethod
  (:use [cljr.lang.multimethod])
  (:use [clojure.test]))

(def a {:name "Arthur" :species  "human" :strength 8})
(def b {:name "Balfor" :species  "elf" :strength 7})
(def c {:name "Calis" :species "elf" :strength 5})
(def d {:name "Drung" :species "orc" :strength 6})

(deftest test-move-1
  (is (. (move a) String/equals "Arthur walks steadily.")))

(deftest test-move-2
  (is (. (move b) String/equals "Balfor runs swiftly.")))

(deftest test-move-3
  (is (. (move c) String/equals "Calis runs swiftly.")))

(deftest test-move-4
  (is (. (move d) String/equals "Drung stomps heavily.")))

(deftest test-attack-1
  (is (. (attack c) String/equals "Calis attacks feebly.")))

(deftest test-attack-2
  (is (. (attack d) String/equals "Drung attacks mightily.")))

(deftest test-encounter-1
  (is (. (encounter b c) String/equals "Two elves, Balfor and Calis, greet each other.")))

(deftest test-encounter-2
  (is (. (encounter d b) String/equals "Evil orc Drung attacks innocent elf Balfor")))

(deftest test-encounter-default
  (is (. (encounter a c) String/equals "Arthur and Calis ignore each other.")))

(deftest test-talk-orch
  (is (. (talk d) String/equals "Drung grunts.")))

(deftest test-talk-other
  (is (. (talk a) String/equals "Arthur speaks.")))

(deftest test-manager-employee-herarchy
  (is (isa? :cljr.lang.multimethod/manager :cljr.lang.multimethod/employee)))
