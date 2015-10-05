(ns beer-song (:require [clojure.string :refer [join capitalize]]) )

(defn- bottle-count [n]
    (cond 
        (= n 0) "no more bottles"
        (= n 1) "1 bottle"
        :else (str n " bottles")))
(defn- bottle-count-decreased [n]
    (cond 
        (= n 0) "99 bottles"
        (= n 1) "no more bottles"
        (= n 2) "1 bottle"
        :else (str (- n 1) " bottles")))

(defn- action-for-bottles [n]
     (cond 
        (= n 0) "Go to the store and buy some more, "
        (= n 1) "Take it down and pass it around, "
        :else  "Take one down and pass it around, "))

(defn verse [n] 
    (str 
        (capitalize (bottle-count n)) 
`       " of beer on the wall, " 
        (bottle-count n) 
        " of beer.\n" 
        (action-for-bottles n) 
        (bottle-count-decreased n) 
        " of beer on the wall.\n"))

(defn sing 
    ([n1 n2]
        (->> (range n1 (dec n2) -1)
            (map #(verse %))
            (join \newline)))
    ([n] (sing n 0)))
