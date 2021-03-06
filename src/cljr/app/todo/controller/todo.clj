(ns cljr.app.todo.controller.todo
  (:use [compojure.core :only [defroutes GET POST]])
  (:require [clojure.string :as str]
            [ring.util.response :as ring]
            [cljr.app.todo.view.todolist :as todolist-v]
            [cljr.app.todo.model.todolist :as todolist-m]))

(defn index []
  (todolist-v/index (todolist-m/all)))

(defroutes routes
  (GET "/" [] (index)))
;;(POST "/" {params :params} (create params))


  
