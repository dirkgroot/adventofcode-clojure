(ns adventofcode.year2021.day06-test
  (:require [clojure.test :refer :all]
            [adventofcode.year2021.day06 :as day]
            [adventofcode.support.test :as test]))

(def example-input
  (day/parse-input "3,4,3,1,2"))

(deftest part1-example
  (is (= (day/part1 example-input) 5934)))

(deftest part2-example
  (is (= (day/part2 example-input) 26984457539)))

(deftest solution
  (test/test-puzzle 2021 6 359999 1631647919273))
