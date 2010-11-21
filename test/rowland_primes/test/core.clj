(ns rowland_primes.test.core
  (:use [rowland_primes.core] :reload)
  (:use [clojure.test]))

(deftest gcd-test
  (is (= 5 (gcd 5 0)))
  (is (= 12 (gcd 12 24)))
  (is (= 12 (gcd 24 12)))
  (is (= 12 (gcd 48 12)))
  (is (= 1 (gcd 3 7))))
