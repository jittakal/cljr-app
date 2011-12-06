(ns ^{:doc "Sample thread examples"
      :autor "Jitendra Takalkar"}
  cljr.lang.fn.thread)

;; Every function in clojure is runnable

;; Sample way to start a new thread for function
;;(.start (Thread. #(println "Hello Thread!")))

;;Sample way to create more than one thread using for
;;(for [i (range 10)]
;;  (.start (Thread. #(println (str "Hello Thread#" i)))))


(defn thread-test
  "Simple thread return the 1 to 10"
  []
  (for [i (range 10)]
    (do (println i) i)))

(first (thread-test))


