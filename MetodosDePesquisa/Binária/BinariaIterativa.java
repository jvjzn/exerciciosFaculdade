import java.util.Scanner;

public class BinariaIterativa {
    
    //Pesquisa Binária Iterativa
    public static boolean pesquisaBinariaIterativa(int vet[], int chave){
        
        boolean resp = false;

        int inicio = 0;
        int fim = vet.length - 1;
        

        while (inicio <= fim){
            int meio = (inicio + fim)/2;

            if (chave == vet[meio]){
                resp = true;
                inicio = fim + 1;
            }else if (chave > vet[meio]){
                inicio = meio + 1;
            }else{
                fim = meio - 1;
            }
        }
        
        return resp;
    }
    
    public static void main(String[] args) throws Exception {
        
        //Criação do input
        Scanner input = new Scanner(System.in);


        //Criação de vetor já previamente ORDENADO
        int vetor[] = {4,8,11,15,16,23,42,57,61,87,92};
        

        //Definição da chave
        int chave = input.nextInt();
        input.close();


        //Run pesquisa
        boolean resposta = pesquisaBinariaIterativa(vetor, chave);


        //Impressão da resposta
        System.out.println("A chave está presente no vetor? >> " + resposta);
    }
}
