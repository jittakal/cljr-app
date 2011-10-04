(ns cljr.app.todo.model.base
  (:require [clojure.string :as str]
            [clojure.java.jdbc :as sql])
  (:import (java.net URI)))

;;export DATABASE_URL="//postgres:postgres@localhost:5432/todo"

(def default-db-url "//postgres:postgres@localhost:5432/todo")

(defn db-spec
  []
  (let [url (URI. (let [db-url (System/getenv "DATABASE_URL")]
                    (if (nil? db-url)
                      default-db-url
                      db-url)))
        host (.getHost url)
        port (if (pos? (.getPort url))
               (.getPort url)
               5432)
        path (.getPath url)]
    (merge
     {:subname (str "//" host ":" port path)}
     (if-let [user-info (.getUserInfo url)]
       {:user (first (str/split user-info #":"))
        :password (second (str/split user-info #":"))}))))

(def db
  (merge
   {:classname "org.postgres.Driver"
    :subprotocol "postgresql"}
   (db-spec)))

