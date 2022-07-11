(ns cbs.import-cloud
  (:gen-class)
  (:require
   [datomic.dev-local :as dl]))

(defn- unsafe-read [path]
  (->> path slurp read-string))

(defn- import-cloud [source target]
  (dl/import-cloud {:source source :dest target}))

(defn -main
  "I don't do a whole lot ... yet."
  [f-source f-target]
  (if (not f-target)
    (prn "Please specify two paths to source/target edn files")
    (import-cloud (unsafe-read f-source) (unsafe-read f-target))))
