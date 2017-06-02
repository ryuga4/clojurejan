(ns clojurejan.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[clojurejan started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojurejan has shut down successfully]=-"))
   :middleware identity})
