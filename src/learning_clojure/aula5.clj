(ns learning-clojure.aula5)

(def estoque {"Mochila" 10, "Camiseta" 5})
(println estoque)

(println "Tamanho do dicionario" (count estoque))
(println "Chaves sao:" (keys estoque))
(println "Valores sao:" (vals estoque))

; keyword
(def estoque {:mochila 10, :camiseta 5})

(println "Adiciona o valor da cadeira (Chave-Valor): " (assoc estoque :cadeira 3))
(println "Altera o valor da cadeira (Chave-Valor): " (assoc estoque :mochila 3))

(println (update estoque :mochila inc))
(println (update estoque :mochila inc))

(defn tira-um
  [valor]
  (- valor 1))

(println "Altera o valor da key (mochila) atraves de uma funcao definida: " (update estoque :mochila tira-um))
(println "Altera o valor da key (mochila) atraves de uma funcao lambda: " (update estoque :mochila #(- % 3)))


(println "Remover elemento do array pela key: " (dissoc estoque :mochila))


(def pedido {:mochila  {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}
             })
(println "\n\n\n\n\n")
(println pedido)
(def pedido (assoc pedido :chaveiro {:quantidade 1, :preco 10}))

(println pedido)
(println "Mais raro, pois pode haver referencia de objeto: " (pedido :mochila))
(println (get pedido :mochila))
(println (get pedido :cadeira {}))

(println (:mochila pedido))
(println (:quantidade (:mochila pedido)))

(println (update-in pedido [:mochila :quantidade] inc))

; THREADING
(println (-> pedido
             :mochila
             :quantidade))