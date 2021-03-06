(ns ^{:doc "Sample web application using Compojure framework"
      :author "Jitendra Takalkar <jitendra.takalkar@gmail.com>"}
  cljr.app.todo.core
  (:use [compojure.core :only [defroutes]])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [ring.adapter.jetty :as ring]
            [cljr.app.todo.controller.todo :as todo-c]
            [cljr.app.todo.view.layout :as layout]))

;; define routes of the application
(defroutes routes
  (todo-c/routes)
  (route/resources "/")
  (route/not-found (layout/four-oh-four)))

(def application (handler/site routes))

(defn start [port]
  (ring/run-jetty (var application) {:port (or port 8080) :join? false}))

(defn -main []
  (let [port (Integer/parseInt
              (if-let [env-port (System/getenv "PORT")] env-port "8080"))]
    (start port)))