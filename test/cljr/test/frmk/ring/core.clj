;(ns cljr.test.frmk.ring.core
;  (:use [cljr.frmk.ring.core])
;  (:use [clojure.test]
;        [ring.mock.request]))

;(deftest test-basic-handler
;  (is (= "Hello World!" (:body (basic-handler (request :get "/"))))))