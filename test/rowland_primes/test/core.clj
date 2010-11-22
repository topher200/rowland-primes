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

(deftest seq1-test
  (let [test-list '(7, 8, 9, 10, 15, 18, 19, 20, 21, 22, 33, 36, 37,
       38, 39, 40, 41, 42, 43, 44, 45, 46, 69, 72, 73)]
    (is (= test-list (take (count test-list) seq1)))))
