(defproject cljr-app "1.0.0-SNAPSHOT"
  :description "cljr-app"  
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/java.jdbc "0.0.6"]
                 [org.clojure.contrib/trace "1.3.0-SNAPSHOT"]
                 [ring/ring-jetty-adapter "0.3.11"]
                 [postgresql/postgresql "8.4-702.jdbc4"]
                 [compojure "0.6.4"]
                 [hiccup "0.3.6"]
                 [clj-http "0.2.1"]]
  :dev-dependencies [[swank-clojure "1.3.2"]]
  :repositories {"sonatype-oss-public" "http://oss.sonatype.org/content/groups/public/"})
