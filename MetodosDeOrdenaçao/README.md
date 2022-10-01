# Métodos de Ordenação

### Bubblesort O(n²): “borbulha” valores maiores para posições superiores do vetor.
Toma-se uma posição de referência para cada posição do início até a referência:
  se o valor for maior do que o valor seguinte, trocam-se os valores.
Repetir até analisar todas as posições do vetor.

### Inserção O(n²): examina as posições anteriores à posição de referência procurando o lugar correto para inserir o valor desta posição.
- Para cada posição de referência, iniciando-se da posição 1 do vetor:
  enquanto o valor anterior for maior que o valor de referência, “volte” uma posição.
- “Avance” todos os elementos em uma posição e insira o elemento de referência na posição correta.

### Mergesort O(n*log n): Usa o princípio da intercalação (merge) para ordenar os dados.
Algoritmo recursivo. Método estável.
Princípios básicos:
- divisão recursiva em subvetores;
- posterior intercalação desses subvetores.
O “segredo” está no método intercalar. A intercalação percorre um subvetor, comparando-o com o subvetor seguinte.
Necessita de espaço de memória adicional:
- chamadas recursivas; subvetores.

### Quicksort O(n²): Dividir o problema da ordenação em ordenações de subconjuntos menores.
Algoritmo recursivo. Não estável.
A partir de um elemento pivô, formar um conjunto de maiores e outro de menores que o pivô.
Escolha o início e o fim da partição;
- Escolha um valor pivô (melhor escolha: último elemento do cojunto);
- Examine todos os valores da partição separando maiores que o pivô à direita e menores à esquerda.
Repita o procedimento para as partições resultantes que sejam maiores que um elemento.

```
Item i < pivô?
§ Se sim; avançar part, trocar i com part, avançar i.
§ Senão; avançar i.
¡ Ao final, avançar part e trocar pivô com part.
```

### Seleção O(n²): Seleciona o menor valor do conjunto para a próxima posição a ser ordenada.
Para cada posição de referência, iniciando-se da primeira posição do vetor:
- selecione o menor valor do vetor;
- troque-o com o da posição de referência.
