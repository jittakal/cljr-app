(ns cljr.lang.dt.datatype
  (:use [cljr.lang.dt.protocol]))

(defrecord Customer [fname lname]
  SampleHttp
  (do-get [this request]
    ;; (println (:uri request))
    {:status 200
      :body (str "GET - Customer : " lname ", " fname)})
  (do-post [this request]
    {:status 200
      :body (str "POST - Customer : " lname ", " fname)})
  Stack  
  (push-into [this coll item]
    (cons coll item))
  (pop-off [this coll]
    (pop coll))
  (get-first [this coll]
    (peek coll)))


