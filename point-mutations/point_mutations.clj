(ns point-mutations)

(defn- differs? [[n1 n2]] (not= n1 n2))
(defn- same-len? [s1 s2] (= (count s1) (count s2)))

(defn hamming-distance [s1 s2]
    (if (same-len? s1 s2)
        (count (filter differs? (map vector s1 s2))) 
        nil))
