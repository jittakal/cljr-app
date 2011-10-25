;;(ns ^{:doc "Sample for using the ClojureQL clojure persistent framework."
;;      :author "Jitendra Takalkar <jitendra.takalkar@gmail.com>"}
;;  cljr.frmk.clojureql.core)


;; (:use [clojureql.core :as ql]
;;       [clojure.connectivity :as qlconn]))

;;  (:use [clojureql.core :as ql])

;; Declare varible 'db' reference to database specification
(def db
  {:classname   "org.postgres.Driver"
   :subprotocol "postgresql"
   :user        "postgresql"
   :password    "postgresql"
   :subname     "//localhost:5432/todo"
   :auto-commit true
   :fetch-size 500})

;;(qlconn/open-global :psql db)



