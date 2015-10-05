(ns anagram)

(defn- sort-str [s] (sort (clojure.string/lower-case s)))
(defn- sort-eq [s1 s2] (= (sort-str s1) (sort-str s2)))
(defn- not-same [s1 s2] (not= (clojure.string/lower-case s1) (clojure.string/lower-case s2))) 

(defn anagrams-for [s coll]
    (->>
        coll
        (filter #(sort-eq % s))
        (filter #(not-same % s))))
