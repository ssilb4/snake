(ns snake.core
  (:import [jline.console ConsoleReader])
  (:gen-class))

(defn keyRead []
  (let [cr (ConsoleReader.)
        keyint (.readCharacter cr)]
    (println (char keyint) "done")
    (println keyint)
    keyint))

(defn vec2d [x y val]
  (vec (repeat y (vec (repeat x val)))))

(defn moveDot [x y direction _vec]
  (let [myVec (assoc _vec x (assoc (_vec x) y 0))
        up 119
        down 115
        left 97
        right 100]
    (cond
      (= direction left)
        (assoc myVec x (assoc (myVec x) (- y 1) 1))
      (= direction right)
        (assoc myVec x (assoc (myVec x) (+ y 1) 1))
      (= direction up)
        (assoc myVec (- x 1) (assoc (myVec (- x 1)) y 1))
      (= direction down)
        (assoc myVec (+ x 1) (assoc (myVec (+ x 1)) y 1)))
  
))

(defn -main []
  (println "start")
  (println (vec2d 10 5 2))
  (println (moveDot 1 1 (keyRead) (vec2d 10 5 2)))
  )
