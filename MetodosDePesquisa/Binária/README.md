# PESQUISA BINÁRIA

- Método de pesquisa recursivo
- Em um conjunto ordenado de dados, a cada passo, decide-se pela continuidade da busca na metade superior ou inferior do conjunto.
- A busca baseia-se sempre no registro do meio do conjunto considerado.

Compara-se a chave de pesquisa com a chave do registro que está na posição do meio do conjunto considerado: 
§ se a chave de pesquisa for menor; 
§ registro procurado está na primeira metade do conjunto.  
§ se a chave de pesquisa for maior; 
§ registro procurado está na segunda metade do conjunto. 

Se início > fim 
    fim da pesquisa  
Se c have de pesquisa == c have do registro do meio 
    fim da pesquisa  
Se c have de pesquisa > c have do registro do meio 
    buscar do (meio + 1) até fim; 
Se c have de pesquisa <  c have do registro do meio 
    buscar do início até (meio – 1); 