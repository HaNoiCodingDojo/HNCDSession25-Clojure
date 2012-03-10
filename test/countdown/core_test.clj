(ns countdown.core-test
  (:use clojure.test
        countdown.core))
(defn countdown [start-point]
  (cond (zero? start-point)  [0]
        :else                (into [start-point]
                                   (countdown (- start-point 1)))))

(deftest test-0-returns-array-with-0
  (is (= [0] (countdown 0))))

(deftest test-1-returns-array-with-1-0
  (is (= [1 0] (countdown 1))))

(deftest test-2-returns-array-with-2-1-0
  (is (= [2 1 0] (countdown 2))))