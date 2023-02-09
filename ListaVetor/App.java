public class App {
    public static void main(String[] args) throws Exception {
        
        Lista minhaLista;
        Inteiro elemento, removido;

        minhaLista = new Lista(10);

        elemento = new Inteiro(18);

        try {
            minhaLista.inserir(elemento, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());  
        }

        elemento = new Inteiro(32);

        try {
            minhaLista.inserir(elemento, 0);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
			minhaLista.imprimir();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		try {
			removido = minhaLista.retirar(1);
			System.out.print("Item removido: ");
			removido.imprimirInteiro();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

        try {
			minhaLista.imprimir();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
    }
}
