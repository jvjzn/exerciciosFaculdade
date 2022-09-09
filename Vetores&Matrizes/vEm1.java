import java.io.IOException;
import java.util.Scanner;

//João Vitor Bessa Lacerda

public class vEm1 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        int numAluno = 0, aux2 = 0, aprovacao;
        char[] gabarito = new char[8], respostas = new char[8];
        int[] nota = new int[10];
        char aux = '\0';

        System.out.println("=-=-=-=-=-=-=-=-=-=");

        System.out.println("Digite o gabarito da prova. (a,b,c,d)");
        for (int cont = 0; cont < 8; cont++) {
            System.out.print((cont+1) + ":>>> ");
            aux = teclado.next().charAt(0);
            gabarito[cont] = aux;
        }

        while (numAluno <= 9) {
            System.out.println("Agora insira as respostas do aluno " + (numAluno + 1) + ":");
            for (int cont2 = 0; cont2 < 8; cont2++) {
                System.out.print((cont2+1) + ":>>> ");
                aux = teclado.next().charAt(0);
                respostas[cont2] = aux;
            }
            for (int cont3 = 0; cont3 < 8; cont3++) {
                if (gabarito[cont3] == respostas[cont3]) {
                    aux2++;
                }
            }
            nota[numAluno] = aux2;
            aux2 = 0;
            numAluno++;
        }
        numAluno = 0;

        System.out.println("=-=-=-=-=-=-=-=-=-=");

        while (numAluno <= 9) {
            aprovacao = nota[numAluno] * 10;
            System.out.println("A nota do aluno " + (numAluno + 1) + " = (" + nota[numAluno] + "/8). Porcentagem de aprovação: " + aprovacao +"%");
            numAluno++;
        }
    }
}