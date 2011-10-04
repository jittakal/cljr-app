(ns cljr.app.todo.model.todolist
  (:use [clojure.java.jdbc :as sql])
  (:use [cljr.app.todo.model.base]))

(defn all
  []
  (sql/with-connection db
    (sql/with-query-results results
      ["select * from todolist"]
      (into [] results))))

(defn create
  [data]
  (sql/with-connection db
    (sql/insert-record :todolist data)))
