(ns app)

(defn identity-number
  [n]
  n)

(defn -main
  "I can say 'Hello World'."
  [& args]
  (println "Hello, World! with number " (str (app/identity-number 2))))