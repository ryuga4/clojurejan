(ns clojurejan.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [clojurejan.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[clojurejan started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojurejan has shut down successfully]=-"))
   :middleware wrap-dev})
