(ns rowland_primes.test.core
  (:use [rowland_primes.core] :reload)
  (:use [clojure.test]))

(deftest gcd-test
  (is (= 5 (gcd 5 0)))
  (is (= 12 (gcd 12 24)))
  (is (= 12 (gcd 24 12)))
  (is (= 12 (gcd 48 12)))
  (is (= 1 (gcd 3 7))))

(deftest algo1-test
  (is (= 7 (algo1 1)))
  (is (= 8 (algo1 2))))

(defn seq-test
  "Test my sequence against good list data from problem spec"
  [test-list sequence]
  (is (= test-list (take (count test-list) sequence))))

(deftest seq1-test
  (seq-test 
   '(7, 8, 9, 10, 15, 18, 19, 20, 21, 22, 33, 36, 37, 38, 39, 40, 41,
	42, 43, 44, 45, 46, 69, 72, 73)
   seq1))

(deftest seq2-test
  (seq-test
   '(1, 1, 1, 5, 3, 1, 1, 1, 1, 11, 3, 1, 1, 1, 1, 1,
	1, 1, 1, 1, 1, 23, 3, 1)
   seq2))
