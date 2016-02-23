(defproject inlein/server "0.1.0-SNAPSHOT"
  :description "Server for inlein"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.stuartsierra/component "0.3.0"]
                 [com.hypirion/bencode "0.1.1"]]
  :main inlein.server.system
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[org.clojure/tools.namespace "0.2.11"]]
                   :source-paths ["dev"]
                   :repl-options {:init-ns user}}})
