(ns countdown.core-test
  (:use clojure.test
        countdown.core))

(deftest test-0-returns-array-with-0
  (is (= [0] (countdown 0))))
