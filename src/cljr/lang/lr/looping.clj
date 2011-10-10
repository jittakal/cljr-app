(ns cljr.lang.lr.looping)

(defn sample-loop-1
  "sample function for looping"
  []
  (loop [result [] x 5]
    (if (zero? x)
      result
      (recur (conj result x) (dec x)))))

(defn sample-loop-2
  "sample function for looping"
  []
  (loop [result [] x 1]
    (if-not (> x 10)
      (do
        ;;(print x " ")
        (recur (conj result x) (inc x)))
      result)))

(defn countdown [result x]
  (if (zero? x)
    result
    (recur (conj result x) (dec x))))

(defn get-arguments
  [map]
  (if-not (empty? map)
    (loop [ret "" keys (keys map)]
      (if keys
        (let [key (first keys) val (get map key)]
          (recur (str ret key "=" val "&") (next keys)))
        ret))
    ""))

(defn sum
  "return the sum of zero or more numbers"
  ([] 0)
  ([x] x)
  ([x & more] (+ x (apply sum more))))
  
(defn average
  "calculate average of zero or more numbers"
  ([] 0)
  ([x] x)
  ([x & more] (/ (+ x (apply sum more))
                 (inc (count more)))))


(defn plus-one
  "this method return the vector of int with plus one"
  [v]
  (loop [lv v i 0]
    (if (= i (count lv))
      lv
      (recur (assoc lv i (inc (get lv i))) (inc i)))))

(defn reverse-me
  "Return the revers vector"
  [v]
  (loop [result [] lv v x (count v)]
    (if (zero? x)
      result
      (recur (conj result (first lv)) (pop lv) (dec x)))))