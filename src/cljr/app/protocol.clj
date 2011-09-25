(ns cljr.app.protocol)

(defprotocol Http
  "This is HTTP protocol"
  (doGet [request response] "GET")
  (doPost [request response] "POST"))
