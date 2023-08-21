package pacote;

import java.util.Random;

//        15/06/1998
//        04/11/1985
//        27/09/1972
//        18/02/2007
//        09/12/1991

public class Main {
    public static void main(String[] args) {

        Data lista[] = new Data[5];

        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            int diaAleatorio = rand.nextInt(29) + 1;
            int mesAleatorio = rand.nextInt(11) + 1;
            int anoAleatorio = rand.nextInt(2000) + 1000;
            Data novaData = new Data(diaAleatorio, mesAleatorio, anoAleatorio);
            lista[0] = novaData;
        }



    }
}