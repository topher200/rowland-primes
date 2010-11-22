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
  ([n] (if (= n 1) 7
	   ;; Using n-2 since we're starting our sequence at 1
	   (+ (nth seq1 (- n 2)) (gcd n (nth seq1 (- n 2)))))))

(def seq1
     (map algo1 (iterate inc 1)))

(def seq2
     ;; Elements in seq2 are the difference between sucessive elements of seq1
     (map
      (fn [n] (- (nth seq1 (+ n 1)) (nth seq1 n)))
      (iterate inc 0)))
