(ns ProblemSet2.intoCamelCase)

(use 'clojure.string)
(use 'clojure.test)
(defn intoCamelCase [s] 
  (apply str (first(split s #"\-"))(map capitalize (rest(split s #"\-"))))
)

(is (= (intoCamelCase "something") "something"))
(is (= (intoCamelCase "multi-word-key") "multiWordKey"))
(is (= (intoCamelCase "leaveMeAlone") "leaveMeAlone"))