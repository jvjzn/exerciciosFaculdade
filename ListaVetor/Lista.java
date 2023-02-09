public class Lista {
    private Inteiro[] lista;
    private int primeiro, ultimo, tamanho;

    public Lista(int total) {
        lista = new Inteiro[total];
        primeiro = 0;
        ultimo = 0;
        tamanho = 0;
    }

    public void inserir(Inteiro valor, int posicao) throws Exception {

        if (!listaCheia()) {
            if ((posicao >= 0) && (posicao <= tamanho)) {
                for (int i = ultimo; i > posicao; i--) {
                    lista[i] = lista[i - 1];
                }
                lista[posicao] = valor;

                ultimo++;
                tamanho++;
            }
        } else {
            throw new Exception("Lista cheia querido");
        }
    }

    public Inteiro retirar(int posicao) throws Exception {
        Inteiro removido;

        if(!listaVazia()){
         if ((posicao >= 0) && (posicao < tamanho)) {
				
				removido = lista[posicao];
				tamanho--;
				
				for (int i = posicao; i < tamanho; i++) {
					lista[i] = lista[i+1];
				}
				
				ultimo--;
				
				return removido;
			} else {
            throw new Exception("Posicao inválida camarada");  
            } 
        } else {
            throw new Exception("Lista vazia amigao");
        }
    }

    public boolean listaVazia() {
        boolean resp;

        if (primeiro == ultimo) {
            resp = true;
        } else {
            resp = false;
        }

        return resp;
    }

    public boolean listaCheia() {
        boolean resp;

        if (ultimo == lista.length) {
            resp = true;
        } else {
            resp = false;
        }

        return resp;
    }

    public void imprimir() throws Exception {

        if(!listaVazia()){
            for (int i = 0; i < tamanho; i++){
                System.out.print("Posição " + i + ": ");
                lista[i].imprimirInteiro();
            } 
        } else {
                throw new Exception("Lista vazia amigao");
            }
    }

}
