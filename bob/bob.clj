(ns bob (:require [clojure.string :as str])) 
(defn- empty-msg? [msg] (clojure.string/blank? msg))
(defn- question? [msg] (= (last msg) \?)) 
(defn- shout? [msg] 
    (and (some #(Character/isLetter %) msg) (not-any? #(Character/isLowerCase %) msg)))

(defn response-for [msg] 
    (cond 
       (empty-msg? msg ) "Fine. Be that way!"
       (shout? msg) "Whoa, chill out!"
       (question? msg) "Sure." 
       :else  "Whatever." ))

