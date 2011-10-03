(ns cljr.app.todo.core
  (:use [compojure.core :only (defroutes GET)])
  (:use [hiccup.page-helpers :only (html5)])
  (:require [ring.adapter.jetty :as ring]))

(defn index []
  (html5
   [:head
    [:title "ToDo"]]
   [:body
    [:div {:id "content"} "Hello World"]]))

(defroutes routes
  (GET "/" [] (index)))

(defn start []
  (ring/run-jetty routes {:port 8080 :join? false}))