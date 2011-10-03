(ns cljr.app.todo.main
  (:use ring.adapter.jetty))

(defn todo-app [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

(defn -main []
  (let [port 8546]
    (run-jetty todo-app {:port port})))