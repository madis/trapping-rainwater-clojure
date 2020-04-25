(defproject trapping-rainwater "0.1.0-SNAPSHOT"
  :description "Calculate how much rainwater can you trap"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot trapping-rainwater.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})