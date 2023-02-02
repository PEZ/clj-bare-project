(ns app-test
  (:require [clojure.test :refer [deftest is testing]]
            [app]))

(deftest identity-number-test
      (testing "Context of the test assertions"
        (is (= (app/identity-number 2) 2)))) 

