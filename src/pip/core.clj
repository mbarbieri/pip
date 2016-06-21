(ns pip.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn split-by-comma [p]
  (str/split p #","))

(defn create-person [x]
  (zipmap [:firstname :lastname] x))

(defn format-winner [w]
  (str "Complimenti "
       (:firstname w) " " (:lastname w)
       "!!! Hai vinto una licenza JetBrains!!! Paga da bere!!!"))

(defn -main
  [& args]
  (->> (nth args 0)
       (slurp)
       (str/split-lines)
       (map split-by-comma)
       (map create-person)
       (rand-nth)
       (format-winner)
       (println)))
