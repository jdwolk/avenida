(defproject avenida "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]
                 [prismatic/dommy "0.1.3"]
                 [rm-hull/monet "0.1.12"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "avenida"
              :source-paths ["src"]
              :compiler {
                :output-to "avenida.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
