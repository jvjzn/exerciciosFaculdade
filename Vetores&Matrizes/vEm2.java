import java.util.Scanner;

//João Vitor Bessa Lacerda 

public class vEm2 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int aux, maior = 0, menor = 0;
        int colunaMaior = 0, linhaMaior = 0, colunaMenor = 0, linhaMenor = 0;

        int[][] matriz = new int[3][4];

        for (int cont1 = 0; cont1 <= 2; cont1++) {
            for (int cont2 = 0; cont2 <= 3; cont2++) {
                System.out.println("Insira o valor da posição [" + cont1 + "," + cont2 + "]");
                System.out.print(">> ");
                aux = teclado.nextInt();
                matriz[cont1][cont2] = aux;

                if (cont1 == 0 && cont2 == 0) {
                    maior = aux;
                    menor = aux;
                    linhaMaior = cont1;
                    colunaMaior = cont2;
                } else {
                    if (aux > maior) {
                        maior = aux;
                        linhaMaior = cont1;
                        colunaMaior = cont2;
                    }
                    else{
                        if (aux < menor) {
                            menor = aux;
                            linhaMenor = cont1;
                            colunaMenor = cont2;                         
                        }
                    }
                }
            }
        }

        System.out.println("=-=-=-=-=-=");
        for (int cont = 0; cont <= 2; cont++) {
            System.out.println(
                    matriz[cont][0] + " | " + matriz[cont][1] + " | " + matriz[cont][2] + " | " + matriz[cont][3]);
        }
        System.out.println("=-=-=-=-=-=");

        System.out.println("Maior elemento da matriz:" + maior);
        System.out.println("Sua posição é: [" + linhaMaior + ", " + colunaMaior + "]");
        System.out.println("Menor elemento da matriz:" + menor);
        System.out.println("Sua posição é: [" + linhaMenor + ", " + colunaMenor + "]");

    }
}