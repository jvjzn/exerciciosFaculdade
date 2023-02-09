public class fila {
    private Inteiro[] fila;
    private int frente, tras, tamanho;

    public fila(int tamanho){
        fila = new Inteiro [tamanho];
        frente = 0;
        tras = 0;
        this.tamanho = tamanho;
    }


        public void enfileirar(Inteiro elemento) throws Exception {

            int posicao;

            if (!filaCheia()){
                posicao = tras % tamanho;
                fila[posicao] = elemento;
                tras++;
            } else {
            throw new Exception("Não foi possível enfileirar o novo elemento: a fila está cheia!");
            }
        } 

        public Inteiro desenfileirar() throws Exception{
            Inteiro desenfileirado;
            int posicao;

            if (!filaVazia()){
                posicao = frente % tamanho;
                desenfileirado = fila[posicao];
                frente++;
                return desenfileirado;
            } else {
                throw new Exception("Não foi possível desenfileirar, pois a fila esta vazia!");
            }

        }

        public boolean filaVazia(){
            boolean resp;

            if(frente == tras){
                resp = true;
            }else{
                resp = false;
            }
            
            return resp;
        }

        public boolean filaCheia(){
            boolean resp;

            if (((tras + 1)%tamanho) == (frente % tamanho)){
                resp = true;
            }else{
                resp = false;
            }
            
            return resp;
        }

        public void imprimir() throws Exception {
            int posicao;
    
            if (!filaVazia()) {
                System.out.println("Conteúdo da fila:");
                for (int i = frente; i < tras; i++) {
                    posicao = i % tamanho;
                    System.out.print("Posição: " + posicao + ": ");
                    fila[posicao].imprimirInteiro();
                }
            } else {
                throw new Exception("Não foi possível mostrar o conteúdo da fila: a fila está vazia!");
            }
        }
}