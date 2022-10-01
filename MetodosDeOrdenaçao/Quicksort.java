public class Quicksort {
    
    private static void quicksort(int[] array, int esq, int dir) {
			
        int part;
        if (esq < dir){
            part = particao(array, esq, dir);
            quicksort(array, esq, part - 1);
            quicksort(array, part + 1, dir);
        }
    }
    
    private static int particao(int[] array, int inicio, int fim) {
		
        int pivot = array[fim];
        int part = inicio - 1;
        for (int i = inicio; i < fim; i++) {
            if (array[i] < pivot) {
                part++;
                swap(array, part, i);
            }
        }
        part++;
        swap(array, part, fim);
        return (part);
    }

    private static void swap(int[] array, int i, int j) {
	      
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    
    public static void main(String[] args) throws Exception {
        
        int vetor[] = {23, 95, 8, 4, 15, 77, 16, 42};

        quicksort(vetor,0,vetor.length - 1);

        for(int x = 0; x < vetor.length; x++){
            System.out.print(vetor[x] + " ");
        }

    }
}
