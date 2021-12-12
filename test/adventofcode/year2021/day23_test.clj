(ns adventofcode.year2021.day23-test
  (:require [clojure.test :refer :all]
            [adventofcode.year2021.day23 :as day]
            [adventofcode.support.test :as test]))

(def example-input
  :todo)

(deftest part1-example
  (is (= (day/part1 example-input) :todo)))

(deftest part2-example
  (is (= (day/part2 example-input) :todo)))

(deftest solution
  (test/test-puzzle 2021 23))
