(ns rowland_primes.core)

(defn gcd 
  "Returns the greatest common denominator of two ints"
  [a b]
  (if (> a b) (gcd b a) ; make sure a < b
      (if (= a 0) b ; if a == 0, return b
	  (gcd b (mod a b)))))

(println (str (gcd 5 0)))
