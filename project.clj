(defproject cljs-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[org.clojure/clojure "1.7.0-beta2"]
                 [org.clojure/clojurescript "0.0-3211"]]
  :plugins [[lein-cljsbuild "1.0.5"]]
  :clean-targets ^{:protect false} ["resources/public/js/"]
  :cljsbuild
  {:builds {:main {:source-paths ["src/cljs"]
                   :compiler {:output-to "resources/public/js/cljs.js"
                              :optimizations :simple
                              :pretty-print true}
                   :jar true}}})
