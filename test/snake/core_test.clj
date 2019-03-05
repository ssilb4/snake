(ns snake.core-test
  (:require [clojure.test :refer :all]
            [snake.core :refer :all]))

(def testArr [[1 2 3] [4 5 6] [7 8 9]])

(deftest testMoveDot
  (testing "moveDot is right"
    (is (= [[0 2 3] [1 5 6] [7 8 9]] (moveDot 0 0 115 testArr)))))

(deftest testAssoc
  (testing "assoc test"
    (is (= (testArr 1) [4 5 6]))
    (is (= (assoc (testArr 1) 0 1) [1 5 6]))))
