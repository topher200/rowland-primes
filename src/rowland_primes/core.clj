(ns rowland_primes.core)

(declare seq1)

(defn gcd 
  "Returns the greatest common denominator of two ints"
  [a b]
  (if (> a b) (gcd b a)  ;; make sure a < b
      (if (= a 0) b  ;; if a == 0, return b
	  (gcd a (mod b a)))))

(def seq1
     (map
      #(if (= % 1) 7
	    ;; Using n-2 since we're starting our sequence at 1
	    (+ (nth seq1 (- % 2)) (gcd % (nth seq1 (- % 2)))))
      (iterate inc 1)))

(def seq2
     ;; Elements in seq2 are the difference between sucessive elements of seq1
     (map
      (fn [n] (- (nth seq1 (+ n 1)) (nth seq1 n)))
      (iterate inc 0)))

(def seq3
     ;; Elements in seq3 are all of seq2, not including 1's
     (filter #(not= % 1) seq2))

(defn factors
  "Returns a list of the prime factors of n"
  [n]
  (if (= n 1) '() ;; (factors 1) == '()
      (loop [i 2]
	(if (= (mod n i) 0)
	  (cons i (factors (/ n i))) ;; found a factor- look for more
	  (recur (inc i))))))

(defn lpf
  "Returns the lowest prime factor of n"
  [n]
  (first (factors n)))
