public class ListaEncadeada {
    private Celula primeiro;
    private Celula ultimo;
    private int tamanho;

    public ListaEncadeada(){
        Celula sentinela = new Celula();

        primeiro = sentinela;
        ultimo = sentinela;
        tamanho = 0;
    }

    public boolean listaVazia(){
        boolean resp;

        if (primeiro == ultimo){
            resp = true;
        } else {
            resp = false;
        }
        return resp;
    }

    public void inserir(Inteiro valor, int posicao) throws Exception{
        Celula anterior, novaCelula, proximaCelula;

        if ((posicao >=0) && (posicao <= tamanho)){
            anterior = primeiro;
            for (int i = 0; i < posicao; i++){
                anterior = anterior.getProximo();
            }

            novaCelula = new Celula(valor);

            proximaCelula = anterior.getProximo();

            anterior.setProximo(novaCelula);
            novaCelula.setProximo(proximaCelula);

            if (posicao == tamanho){
                ultimo = novaCelula;
            }
            
            tamanho++;

        } else {
            throw new Exception("Posição inválida.");
        }
    }

    public Inteiro remover(int posicao) throws Exception{
        Celula anterior, celulaRemovida, proximaCelula;

        if(!listaVazia()){
            if((posicao >= 0) && (posicao <= tamanho)){
                anterior = primeiro;
                for (int i = 0; i < posicao; i++){
                    anterior = anterior.getProximo();
                }

                celulaRemovida = anterior.getProximo();

                proximaCelula = celulaRemovida.getProximo();
                
                anterior.setProximo(proximaCelula);
                celulaRemovida.setProximo(null);

                if(celulaRemovida == ultimo){
                    ultimo = anterior;
                }

                tamanho--;

                return (celulaRemovida.getItem());
            } else {
                throw new Exception("Posição inválida.");
            }
        } else {
            throw new Exception("Lista vazia.");
        }
    }

    public void imprimir() throws Exception{
        Celula aux;

        if(!listaVazia()){
            System.out.println("Conteúdo da lista: ");

            aux = primeiro.getProximo();

            while (aux != null){
                aux.getItem().imprimirInteiro();
                aux = aux.getProximo();
            }

        } else {
            throw new Exception("Lista vazia.");
        }
    }



}
