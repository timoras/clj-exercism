(ns word-count)

(defn word-count [s]
    (->>
        (clojure.string/split s #"\W+")
        (map clojure.string/lower-case)
        frequencies))
