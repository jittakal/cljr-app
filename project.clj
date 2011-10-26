(defproject cljr-app "1.0.0-SNAPSHOT"
  :description "cljr-app"  
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/java.jdbc "0.0.6"]
                 [org.clojure.contrib/trace "1.3.0-SNAPSHOT"]
                 [org.clojure.contrib/json "1.3.0-SNAPSHOT"]
                 [ring/ring-jetty-adapter "1.0.0-RC1"]
                 [ring/ring-core "1.0.0-RC1"]
                 [ring/ring-servlet "1.0.0-RC1"]
                 [ring-mock "0.1.1"]
                 [postgresql/postgresql "8.4-702.jdbc4"]
                 [compojure "0.6.4"]
                 [hiccup "0.3.6"]
                 [clj-http "0.2.1"]]
  :dev-dependencies [[swank-clojure "1.4.0-SNAPSHOT"]
                     [lein-ring "0.4.5"]]
  :ring {:handler cljr.app.demo.core/demoroutes}
  :repositories {"sonatype-oss-public" "http://oss.sonatype.org/content/groups/public/"})
