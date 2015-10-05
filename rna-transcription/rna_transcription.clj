(ns rna-transcription)

(defn to-rna [s]

    {:pre [(every? {\G \C \C \G \T \A \A \U} s)]}
    (let [dna-rna-map {\G \C \C \G \T \A \A \U}]
        (apply str (map dna-rna-map s))))
