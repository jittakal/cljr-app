(ns cljr.lang.dt.protocol)

(defprotocol SampleHttp
  "This is sample HTTP protocol"
  (do-get [this request response] "GET")
  (do-post [this request response] "POST"))

(defprotocol Stack
  "This is sample stack protocol"
  (push-into [this coll item] "push item in collection")
  (pop-off [this coll] "pop from the collection")
  (get-first [this coll] "return the first element"))


