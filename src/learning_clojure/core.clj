(ns learning-clojure.core)


:PREDICATE
(defn mais-caro-que-100?
  [valor-bruto]
  (> valor-bruto 100))



(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println "Função anônima: ")
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))
(println (valor-descontado (fn [v] (> v 100)) 100))

(println "Função anônima simplificada: (Obs: # é subsituido pelo termo Fn e o %1 é referente ao primeiro argumento)")
(println (valor-descontado #(> %1 100) 1000))
(println (valor-descontado #(> %1 100) 100))

(println "Função anônima simplificada com apenas 1 argumento: ")
(println (valor-descontado #(> % 100) 1000))
(println (valor-descontado #(> % 100) 100))

(println "Função definida: ")
(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))

