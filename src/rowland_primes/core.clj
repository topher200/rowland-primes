(ns rowland_primes.core)

(declare seq1)

(defn gcd 
  "Returns the greatest common denominator of two ints"
  [a b]
  (if (> a b) (gcd b a)  ;; make sure a < b
      (if (= a 0) b  ;; if a == 0, return b
	  (gcd a (mod b a)))))

(defn algo1
  "Algorithm for the first sequence of the problem"
  ([n]
     (if (= n 1) 7
	 (+ (nth seq1 (- n 2)) (gcd n (nth seq1 (- n 2))))))) ;; n-2 since we're starting at 1

(def seq1
     (map algo1 (iterate inc 1)))
