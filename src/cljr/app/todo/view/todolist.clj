(ns cljr.app.todo.view.todolist
  (:use [hiccup.core :only [html h]]
        [hiccup.page-helpers :only [doctype]]
        [hiccup.form-helpers :only [form-to label text-area submit-button]])
  (:require [cljr.app.todo.view.layout :as layout]))

(defn display-todolists
  [todolists]
  [:div {:id "todolists"}
   (map
    (fn [todolist]
      [:h2 {:class "todolist"} (h (:name todolist))])
    todolists)])

(defn index
  [todolists]
  (layout/common "Todo Lists"
                 (display-todolists todolists)))