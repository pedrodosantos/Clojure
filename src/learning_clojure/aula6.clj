(ns learning-clojure.aula6)

(def pedido {:mochila  {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}
             })

(defn imprime-e-15
  [[chave valor]]
  valor)

(println (map imprime-e-15 pedido))

(defn preco-por-produto
  [[chave valor]]
  (* (:quantidade valor) (:preco valor)))

(println (map preco-por-produto pedido))
(println (reduce + (map preco-por-produto pedido)))

; THREAD LAST
(defn total-do-pedido
  [pedido]
  (->> pedido
       (map preco-por-produto )
       (reduce +)))

(println (total-do-pedido pedido))

(defn preco-total-do-produto [produto]
  (* (:quantidade produto) (:preco produto)))

(defn total-do-pedido
  [pedido]
  (->> pedido
       vals
       (map preco-total-do-produto )
       (reduce +)))

(println (total-do-pedido pedido))