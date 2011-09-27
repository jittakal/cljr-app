(ns cljr.app.dt.datatypes
  (:use [cljr.app.dt.protocols]))

(defrecord Customer [fname lname]
  SampleHttp
  (do-get [this request response]
    ;; (println (:uri request))
    (assoc response :status 200
           :body (str "GET - Customer : " lname ", " fname)))
  (do-post [this request response]
    (assoc response :status 200
                    :body (str "POST - Customer : " lname ", " fname))))
