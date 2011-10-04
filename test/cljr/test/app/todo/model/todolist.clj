(ns cljr.test.app.todo.model.todolist
  (:use [cljr.app.todo.model.todolist])
  (:use [clojure.test]))

(deftest test-all
  (is (= 1 (count (all)))))

;;(deftest test-create
;;(is (. "Home" String/equals (:name (create {:name "Home"})))))

