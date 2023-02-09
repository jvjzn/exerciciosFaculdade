public class App {
    public static void main(String[] args) throws Exception {
        
        Pilha minhaPilha;
        Inteiro topo, elemento, desempilhado;

        minhaPilha = new Pilha(4);

        elemento = new Inteiro(6);

        try {
            minhaPilha.empilhar(elemento);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        elemento = new Inteiro(17);

        try { 
            minhaPilha.empilhar(elemento);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        elemento = new Inteiro(43);

        try{
            minhaPilha.empilhar(elemento);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            desempilhado = minhaPilha.desempilhar();
            System.out.print("Desempilhado: ");
            desempilhado.imprimirInteiro();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            topo = minhaPilha.consultarTopo();
            System.out.print("Topo: ");
            topo.imprimirInteiro();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}