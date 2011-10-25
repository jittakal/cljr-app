(ns cljr.app.demo.core
  (:use [compojure.core :only [defroutes GET POST ANY]])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.adapter.jetty :as ring]))

;; Steps to follow
;; 1. Define Routes using (defroutes)
;; 2. define acutal routes using (HTTP-VERB url-pattern handler)
;; handler is simply return html code snippet
;; 3. Start server by registering the earlier define routes

(defroutes demoroutes
  "All the routes for Demo application"
  (GET "/getme" [] "<h1>Your Request is GET for /getme modified</h1>")
  (POST "/postme" [] "<h1>Your Request is POST for /postme</h1>")
  (ANY "*" [] "<h1>Sorry! unhandled request - ignored</h1>"))

(def demoapp (handler/site demoroutes))

(defn -main []
  (ring/run-jetty (var demoapp) {:port 8080 :join false}))




