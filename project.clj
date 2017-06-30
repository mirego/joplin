(defproject com.mirego/joplin "0.3.12-SNAPSHOT"
  :description "Flexible datastore migration and seeding"
  :url "http://github.com/mirego/joplin"
  :scm {:name "git"
        :url  "https://github.com/mirego/joplin"}
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :plugins [[lein-sub "0.3.0"]]
  :sub ["com.mirego/joplin.jdbc"
        "com.mirego/joplin.elasticsearch"
        "com.mirego/joplin.zookeeper"
        "com.mirego/joplin.datomic"
        "com.mirego/joplin.cassandra"
        "com.mirego/joplin.dynamodb"
        "com.mirego/joplin.hive"])
