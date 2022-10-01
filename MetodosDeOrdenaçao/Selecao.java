public class Selecao {
    public static void main(String[] args) throws Exception {
        
        int vetor[] = {23, 16, 4, 42, 8, 15};

        for (int i = 0; i < vetor.length; i++){
            int menor = i;
            for(int a = (i + 1); a < vetor.length; a++){
                if (vetor[menor] > vetor[a]){
                    menor = a;
                }
                
            }
            
            int aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;

        }
        for (int b = 0; b < vetor.length; b++ ){
            System.out.print(vetor[b] + " ");  
        }
        
    }
}