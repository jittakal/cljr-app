(ns cljr.lang.dt.protocol)

(defprotocol SampleHttp
  "This is sample HTTP protocol"
  (do-get [this request] "GET")
  (do-post [this request] "POST"))

(defprotocol Stack
  "This is sample stack protocol"
  (push-into [this coll item] "push item in collection")
  (pop-off [this coll] "pop from the collection")
  (get-first [this coll] "return the first element"))

(defprotocol BaseDao
  "This is sample BaseDao protocol (Interface)"
  (get-by-id [this ^String id] "Return single record by primary key")
  (get-all [this] "Return all records"))

(defprotocol SampleProtocol
  "Sample protocol to explore default implementation"
  (method-one [this] "Return toString"))

(defprotocol AnotherProtocol
  "Another Sample protocol - extend-protocol"
  (method-two [this] "Returns Hello World!"))


