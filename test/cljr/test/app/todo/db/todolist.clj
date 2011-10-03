(ns cljr.test.app.todo.db.todolist
  (:use [cljr.app.todo.db.todolist])
  (:use [clojure.test]))

(deftest test-get-all
  (is (= 1 (count (get-all)))))

;;(deftest test-create-record
;;(is (. "Home" String/equals (:name (create-record {:name "Home"})))))

