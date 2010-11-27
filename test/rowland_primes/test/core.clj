(ns rowland_primes.test.core
  (:use [rowland_primes.core] :reload)
  (:use [clojure.test]))

(deftest gcd-test
  (is (= 5 (gcd 5 0)))
  (is (= 12 (gcd 12 24)))
  (is (= 12 (gcd 24 12)))
  (is (= 12 (gcd 48 12)))
  (is (= 1 (gcd 3 7))))

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

(deftest seq3-test
  (seq-test
   '(5, 3, 11, 3, 23, 3, 47, 3, 5, 3, 101, 3, 7, 11, 3, 13, 233, 3,
	467, 3, 5, 3, 941, 3)
   seq3))

(deftest factors-test
  (is (= '() (factors 1)))
  (is (= '(2) (factors 2)))
  (is (= '(2 2) (factors 4)))
  (is (= '(2 2) (factors 4)))
  (is (= '(5 5 5) (factors 125)))
  (is (= '(2 2 5 5) (factors 100))))

(deftest lpf-test
  (is (= 1 (lpf 1)))
  (is (= 2 (lpf 2)))
  (is (= 2 (lpf 4)))
  (is (= 3 (lpf 15)))
  (is (= 5 (lpf 25)))
  (is (= 2 (lpf 100))))

(deftest sum-shortcut-test
  (is (= (sum-shortcut 1) 5))
  (is (= (sum-shortcut 2) 8))
  (is (= (sum-shortcut 3) 19))
  (is (= (sum-shortcut 24) 1902)))

(deftest shortcut-test
  (seq-test
   (take 20 seq3)
   shortcut))
