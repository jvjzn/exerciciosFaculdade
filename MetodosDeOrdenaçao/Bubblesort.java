public class Bubblesort {
    public static void main(String[] args) throws Exception {
        
        int vetor[] = {23, 16, 4, 42, 8, 15};

        for(int i = vetor.length - 1; i > 0; i--){
            
            for (int w = 0; w < i; w++){
                
                if (vetor[w] > vetor[w+1]){
                    int aux = vetor[w];
                    vetor[w] = vetor[w+1];
                    vetor[w+1] = aux;
                }
            
            }
        
        }

        for (int a = 0; a < vetor.length; a++){
            System.out.print(vetor[a] + " ");   
        }
        
    }
}