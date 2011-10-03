(ns cljr.app.todo.db.dbcommon
  (:use [clojure.java.jdbc :as sql]))

(def db
  {:classname "com.postgresql.Driver"
   :subprotocol "postgresql"
   :subname "//localhost:5432/todo?user=postgres&password=Sept_1234"})
