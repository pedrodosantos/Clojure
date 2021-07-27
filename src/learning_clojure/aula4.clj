(ns learning-clojure.aula4)

(def precos [30 700 1000])

(println (precos 1))
(println (get precos 1))

(println "Caso a posicao 17 nao exista no array retorna: "
         (get precos 17))
(println "Caso a posicao 17 nao exista no array retorna o valor padrao: "
         (get precos 17 0))

(println "Adiciona um valor ao final do array mas nao altera o array: " (conj precos 5))
(println "Array original: " precos)

(println "Somar +1 a um valor: " (inc 5) ". Mesmo efeito (+ 5 1)")
(println "Aplica update em um array(+1): " (update precos 0 inc))
(println "Aplica update em um array(-1): " (update precos 0 dec))

(defn soma-3
  [valor]
  (+ valor 3))

(println "Funcao personalizada soma +3: " (update precos 0 soma-3))

(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100. "
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println "Funcao map tem comportamento de um FOR: " (map valor-descontado precos))

(println (range 10))
(println (filter even? (range 10)))

(println "Aplica o filtro de Aplica-Desconto: " (filter aplica-desconto? precos))
(println "Map apos o filtro de Aplica-Desconto: "(map valor-descontado (filter aplica-desconto? precos)))