import java.util.Scanner;

public class BinariaRecursiva {
    
    //Pesquisa Binária Recursiva
    public static boolean pesquisaBinariaRecursiva(int vet[], int chave, int inicio, int fim){
        boolean resp = false;
        int meio = (inicio+fim)/2;

        if(inicio>fim){
            resp = false;
        }else if(chave == vet[meio]){
            resp = true;
        }else if(chave > vet[meio]){
            resp = pesquisaBinariaRecursiva(vet, chave, meio+1, fim);
        }else{
            resp = pesquisaBinariaRecursiva(vet, chave, inicio, meio-1);
        }

        return resp;
    }
    
    
    public static void main(String[] args) throws Exception {
        
        //Criação do input
        Scanner input = new Scanner(System.in);


        //Criação do vetor já ORDENADO
        int vetor[] = {4,8,11,15,16,23,42,57,61,87,92};
        int inicio = 0;
        int fim = vetor.length - 1;


        //Definição de chave
        int chave = input.nextInt();
        input.close();


        //Run pesquisa recursiva
        boolean resposta = pesquisaBinariaRecursiva(vetor, chave, inicio, fim);


        //Impressão da resposta
        System.out.println("A chave está no vetor? >> " + resposta);

    }
}
