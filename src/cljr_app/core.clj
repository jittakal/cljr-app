(ns cljr-app.core)

(println "Hello World")

(defn sayhello
  [name]
  (println (str "Hello " name "")))

(defn usingStrEquals
  [fname lname]
  (println (if (. fname String/equals lname)
             (println "First name and Last name should not be same.")
             (println (str "Your full name is : " fname " " lname)))))
