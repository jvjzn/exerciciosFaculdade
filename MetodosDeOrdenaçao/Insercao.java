public class Insercao {
    public static void main(String[] args) throws Exception {

        int vetor[] = { 23, 16, 4, 42, 8, 15 };

        for (int i = 1; i < vetor.length; i++) {
            int aux = vetor[i];
            int w = i - 1;

            while ((w >= 0) && (vetor[w] > aux)) {
                vetor[w + 1] = vetor[w];
                w--;
            }
            vetor[w + 1] = aux;
            
            System.out.print(i +") - ");
            for(int a = 0; a < vetor.length; a++){
                System.out.print(vetor[a] + " ");
            }
            
            System.out.println("\n");
        }
        
    }
}
