(ns cljr.lang.dt.protocols)

(defprotocol SampleHttp
  "This is sample HTTP protocol"
  (do-get [this request response] "GET")
  (do-post [this request response] "POST"))
