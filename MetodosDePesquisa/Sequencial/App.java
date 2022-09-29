import java.util.Scanner;

public class App {
    
    //Pesquisa Sequencial
    public static boolean pesquisaSequencial(int[] vet, int val) {
        boolean resp = false;

            for (int i = 0; i < vet.length; i++) {
                if (vet[i] == val) {
                    resp = true;
                    i = vet.length;
                }
            }
        
        return resp;
    }

    public static void main(String[] args) throws Exception {

        //Criação de input
        Scanner input = new Scanner(System.in);

        
        //Criação do vetor e armazenamento de valores
        int vetor[] = {57, 8, 15, 42, 4, 23, 16, 61, 92, 11, 87};


        //Definição de qual valor deve-se verificado
        System.out.print("Insira o valor: ");
        int valor = input.nextInt();
        input.close();


        //Criação de verificador
        boolean resposta = pesquisaSequencial(vetor,valor);


        //Output
        System.out.println("O valor está no vetor? >> " + resposta);
    }    
}
