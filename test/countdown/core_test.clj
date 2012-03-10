(ns countdown.core-test
  (:use clojure.test
        countdown.core))
(defn countdown [start-point]
  [0])

(deftest test-0-returns-array-with-0
  (is (= [0] (countdown 0))))
