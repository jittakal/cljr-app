(ns cljr.app.todo.db.todolist
  (:use [clojure.java.jdbc :as sql])
  (:use [cljr.app.todo.db.dbcommon]))

(defn get-all
  []
  (sql/with-connection db
    (sql/with-query-results results
      ["select * from todolist"]
      (into [] results))))

(defn create-record
  [data-map]
  (sql/with-connection db
    (sql/insert-record :todolist data-map)))