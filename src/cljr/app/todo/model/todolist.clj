(ns cljr.app.todo.model.todolist
  (:use [cljr.app.todo.model.base :only (db)])
  (:require [clojure.java.jdbc :as sql]))

(defn all
  []
  (sql/with-connection db
    (sql/with-query-results results
      ["select * from todolist"]
      (into [] results))))

(defn create
  [todolist]
  (sql/with-connection db
    (sql/insert-record :todolist todolist)))
