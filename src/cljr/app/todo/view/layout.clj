(ns cljr.app.todo.view.layout
  (:use [hiccup.core :only [html]]
        [hiccup.page-helpers :only [doctype include-css]]))

(defn comment
  "Wrap the supplied HTML in a comment"
  [html]
  (str "<!--" html "-->"))

(defn common [title & body]
  (html
   (doctype :html5)
   [:head
    [:meta {:charset "utf-8"}]
    [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1, maximum-scale=1"}]
    [:title title]
    [:link {:rel "stylesheet" :href "/css/screen.css" :type "test/css" :media "screen projection"}]
    [:link {:rel "stylesheet" :href "/css/screen.css" :type "test/css" :media "print"}]
    (comment "[if lt IE 8]><link href=\"/css/ie.css\" media=\"screen,projection\" rel=\"stylesheet\" type=\"text/css\" /><![endif]")
    [:link {:rel "stylesheet" :href "/css/plugins/fancy-type/screen.css" :type "test/css" :media "screen, projection"}]
    (include-css "http://fonts.googleapis.com/css?family=Sigmar+One&v1")]
   [:body
    [:div {:class "container"}
     [:div {:id "header" :class "span-24 last"}
      [:h1 {:id "todo"}
       [:img {:src="images/header.gif" :alt "ToDo" :id "header-image"}]]]
     [:hr]
     [:div {:id "subheader" :class "span-24 last"}
      [:h3 {:class "alt"} "Latest Task"]]
     [:hr]
     [:h1 {:class "container"} "ToDo"]]
    [:div {:id "content" :class "container"} body]]))

(defn four-oh-four
  []
  (common "Page Not Found"
          [:div {:id "four-oh-four"}
           "The page you requested could not be found"]))