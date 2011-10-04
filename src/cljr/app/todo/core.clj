(ns cljr.app.todo.core
  (:use [compojure.core :only [defroutes]])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.adapter.jetty :as ring]
            [cljr.app.todo.controllers.todos]
            [cljr.app.todo.views.layout :as layout]))

(defroutes routes
  cljr.app.todo.controllers.todos/routes
  (route/resources "/")
  (route/not-found (layout/four-oh-four)))

(def application (handler/site routes))

(defn start [port]
  (ring/run-jetty (var application) {:port (or port 8080) :join? false}))

(defn -main []
  (let [port (Integer/parseInit (System/getenv "PORT"))]
    (start port)))