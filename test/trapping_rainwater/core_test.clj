(ns trapping-rainwater.core-test
  (:require [clojure.test :refer :all]
            [trapping-rainwater.core :refer :all]))

(deftest a-test
  (testing "equality works"
    (is (= 1 1))))

(deftest calculate-water-tests
  (testing "finding left wall"
    (is (= (find-left-walls [1 2 3]) [1 2 3]))
    (is (= (find-left-walls [2 1 2]) [2 2 2]))
    (is (= (find-left-walls [1 2 3 2 1]) [1 2 3 3 3]))
    (is (= (find-left-walls [3 2 1 2 3]) [3 3 3 3 3]))
    (is (= (find-left-walls [2 1 3 1 2]) [2 2 3 3 3]))
    )
  (testing "finding right wall"
    (is (= (find-right-walls [1 2 3]) [3 3 3]))
    (is (= (find-right-walls [2 1 2]) [2 2 2]))
    (is (= (find-right-walls [1 2 3 2 1]) [3 3 3 2 1]))
    )
  (testing "finding captured water between walls"
    (is (= (calculate-water [1 2 3]) 0))
    (is (= (calculate-water [2 1 2]) 1))
    (is (= (calculate-water [0 1 0 2 1 0 1 3 2 1 2 1]) 6))
    )
  )
