(ns cbs.import-cloud
  (:gen-class)
  (:require
   [datomic.dev-local :as dl]))

(defn- unsafe-read [path]
  (->> path slurp read-string))

(defn- import-cloud [source target]
  (dl/import-cloud {:source source :dest target}))

(defn -main
  [f-source f-target]
  (if (not f-target)
    (prn "Please specify source and target edn file paths")
    (import-cloud (unsafe-read f-source) (unsafe-read f-target))))
