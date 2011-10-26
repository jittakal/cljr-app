;; To run demo application add following in project.clj
;; :ring {:handler cljr.app.demo.core/demoapp}
;; Command to start the ring server
;; lein ring server

(ns ^{:doc "Sample demo application using compojure framework"
      :author "Jitendra Takalkar <jitendra.takalkar@gmail.com>"}
  cljr.app.demo.core
  (:use [compojure.core :only [defroutes GET POST ANY]])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.adapter.jetty :as ring]))

;; Steps to follow
;; 1. Define Routes using (defroutes)
;; 2. define acutal routes using (HTTP-VERB url-pattern handler)
;; handler is simply return html code snippet
;; 3. Start server by registering the earlier define routes

(defroutes demo-routes
  "All the routes for Demo application"
  (route/resources "/demo")
  (GET "/" [] "<h1>Demo Application</h1>")
  (GET "/getme" [] "<h1>Your Request is GET for /getme</h1>")
  (POST "/postme" [] "<h1>Your Request is POST for /postme</h1>")
  (ANY "*" [] "<h1>Sorry! unhandled request - ignored</h1>"))

(def demoapp (handler/site demo-routes))

(defn -main []
  (ring/run-jetty (var demoapp) {:port 8080 :join false}))
