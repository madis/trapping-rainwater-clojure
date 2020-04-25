(ns trapping-rainwater.core
  (:gen-class))

(defn how-much-water-between-walls [heights]
  (let [[left center right] heights]
    (- (min left right) center)))

; Left wall is highest element on the elevations map
; up until the current one (including)
(defn find-left-walls [elevations]
  (reduce #(conj %1 (max (or (last %1) 0) %2)) [] elevations))

(defn find-right-walls [elevations]
  (reverse (find-left-walls (reverse elevations))))

(defn calculate-water [elevations]
  (let [left-walls (find-left-walls elevations)
        right-walls (find-right-walls elevations)
        left-center-right (map vector left-walls elevations right-walls)]
    (reduce #(+ %1 (how-much-water-between-walls %2)) 0 left-center-right)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (calculate-water (map #(Integer/parseInt %) args))))
