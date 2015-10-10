(ns nucleotide-count)

(def ^{ :private true} nucleotides #{\G \C \T \A }) 
(defn- sanity-check [c s]
    (if (and 
            (every? nucleotides s) 
            (nucleotides c))
        nil
         (throw (Exception. "invalid nucleotide"))))

(defn nucleotide-counts [s]
   (merge (zipmap nucleotides (repeat 0)) (frequencies s)))

(defn count [c s]
    (sanity-check c s)
    (get (frequencies s) c 0))
