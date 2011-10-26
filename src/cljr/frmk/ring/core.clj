(ns cljr.frmk.ring.core
  (:use [ring.util.response]
        [ring.middleware.params]
        [ring.middleware.session]
        [ring.middleware.session.memory]
        [ring.middleware.session.store]
        [ring.middleware.keyword-params]
        [ring.middleware.lint]))

;; Basic example as per ring handler and middleware specification
;; Handler functions
(defn basic-handler
  "Basic handler function"
  [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello World!"})

;; Custom Middleware functions
(defn wrap-upcase
  [handler]
  (fn [request]
    (let [response (handler request)]
      (assoc response :body (.toUpperCase (:body response))))))

;; Applications main handler function
(def uapp (-> basic-handler (wrap-upcase)))

;;(run-jetty uapp {:port 8080})



;; utility functions

(defn- header-layout
  [^String title]
  (str "<html><head><title>"
       title
       "</title></head><body>"))

(defn- footer-layout
  [request ^String year]
  (str "<hr/><br/><div style=\"display: none; border: 1px solid blue\">"
       request
       "</div>"
       "</body></html>"))

(defmacro main-layout
  "Main Layout"
  [title request & body]
  `(str (header-layout ~title)
       ~@body
       (footer-layout ~request "2011-2012")))

(defn page
  "Sample Page"
  [name]
  (main-layout "Sample"
               {}
               (str (if name
                      (str "Nice to meet you, " name "!")
                      (str "<form>"
                           "Name: <input name='name' type='text'/>"
                           "<input type='submit'/>"
                           "</form>")))))

(defn index
  [request]  
  (main-layout "Index"
               request
               (str "<div style=\"float:left\">Hello World!</div><div style=\"float:right\"><a href=\"/login\">Login</a></div>")))

(defn welcome
  [request]
  (if (= :get (:request-method request))
    (login request)
    (main-layout "Welcome"
               request
               (str "Welcome " (get (:form-params request) "userid") "! Wish you a very Happy Diwali!!!"))))

(defn login
  [request]  
  (main-layout "Login"
               request
               (str "<form action=\"/welcome\" method=\"POST\"><input type=\"text\" name=\"userid\" value=\"\"/><input type=\"password\" name=\"passwd\"/><input type=\"submit\"/></form>")))

(defn not-found
  [request]  
  (main-layout "404"
               request
               (str "<div>Page Not Found</div>")))

(defn form-handler
  "Form Handler"
  [params]
  (println "params => " params)
  (-> (response (page params))
      (content-type "text/html")))

;; Route mapper
(def uri-map {"/" index
              "/welcome" welcome
              "/login" login})

(defn uri-handler
  "Handle the uri and call the respective handler function"
  [request]
  (-> (response ((let [fname (get uri-map (:uri request))]
                   (if fname fname not-found)) request))))

;; (if (and (or (empty? (:session rmap)) (= "/welcome" (:uri rmap))) (not= "/login" (:uri rmap)))
;;  (-> (redirect "/login") wrap-session)
;; (-> (response ((let [fname (get uri-map (:uri rmap))]
;;               (if fname fname not-found) ) rmap))))


;; Custom Middlerware functions
(defn wrap-content-type
  [handler ^String content-type]
  (fn [request]
    (let [response (handler request)]
      (assoc-in response [:headers "Content-Type"] content-type))))


;; Main application handler function
(def handler (-> uri-handler
                 (wrap-content-type "text/html")
                 (wrap-params)
                 (wrap-keyword-params)
                 (wrap-session)
                 (wrap-lint)))

;;(-> uri-handler wrap-params))

