public class Pilha {
    private Inteiro [] pilha;
    private int topo;

    Pilha(int tamanho){
        pilha = new Inteiro[tamanho];
        topo = 0;
    }


    public void empilhar(Inteiro valor) throws Exception{

        if(!pilhaCheia()){
            pilha[topo] = valor;
            topo++;
        } else{
            throw new Exception ("Pilha cheia, impilhável :(");
        }
    }

    public Inteiro desempilhar() throws Exception{
        Inteiro desempilhado;

        if (!pilhaVazia()){
            topo--;
            desempilhado = pilha[topo];
            return desempilhado;
        } else {
            throw new Exception ("Pilha vazia, desimpilhável :(");
        }
    }

    public Inteiro consultarTopo() throws Exception{
        
        if (!pilhaVazia()){
            return (pilha[topo-1]);
        } else {
            throw new Exception("Pilha vazia, desimpilhável :(");
        }
    }

    public boolean pilhaVazia(){
        boolean resp;

        if (topo == 0){
            resp = true;
        } else{
            resp = false;
        }

        return resp;
    }

    public boolean pilhaCheia(){
        boolean resp;

        if(topo == pilha.length){
            resp = true;
        } else {
            resp = false;
        }

        return resp;
    }


}
