(ns user
  (:require [mount.core :as mount]
            clojurejan.core))

(defn start []
  (mount/start-without #'clojurejan.core/repl-server))

(defn stop []
  (mount/stop-except #'clojurejan.core/repl-server))

(defn restart []
  (stop)
  (start))


