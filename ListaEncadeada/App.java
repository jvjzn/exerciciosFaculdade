public class App {
    public static void main(String[] args) throws Exception {
        
        ListaEncadeada minhaLista;
        Inteiro novo, removido;

        minhaLista = new ListaEncadeada();

        novo = new Inteiro(6);

        try{
            minhaLista.inserir(novo, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        novo = new Inteiro(12);

        try{
            minhaLista.inserir(novo, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        novo = new Inteiro(18);

        try { 
            minhaLista.inserir(novo, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            removido = minhaLista.remover(1);
            System.out.println("Removido ->" + removido);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            minhaLista.imprimir();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
