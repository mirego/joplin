(defproject com.mirego/joplin.elasticsearch "0.3.12-SNAPSHOT"
  :description "ElasticSearch support for Joplin"
  :url "http://github.com/mirego/joplin"
  :scm {:name "git"
        :url "https://github.com/mirego/joplin"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.mirego/joplin.core "0.3.12-SNAPSHOT"]
                 [clojurewerkz/elastisch "2.2.1"]
                 [clj-time "0.12.0"]])
