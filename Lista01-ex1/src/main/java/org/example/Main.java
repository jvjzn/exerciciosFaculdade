package org.example;

public class Main {
    public static void main(String[] args) {

        Data novaData;

        try {
            novaData = new Data(15,4,2023);
        } catch (ExcecaoDataInvalida e) {
            throw new RuntimeException(e);
        }

        boolean r1 = novaData.eAnoBisexto();

        if (r1 == true){
            System.out.println(novaData.getAno() + " é um ano bissexto.");
        }else {
            System.out.println(novaData.getAno() + " não é um ano bissexto.");
        }

        int r2 = novaData.diasNoMes();
        System.out.println("O mês " + novaData.getMes() + " tem: " + r2 + " dias.");

        novaData.adicionaDias(3);
        System.out.println("-Avançando 3 dias-");
        System.out.println("Data atualizada: " + novaData.toString());

        String r3 = novaData.diaDaSemana();
        System.out.println("Dia da semana: " + r3);

        novaData.proximoDia();
        System.out.println("Avançando um dia: " + novaData.toString());

        String r4 = novaData.porExtenso();
        System.out.println("Por extenso: " + r4);

    }
}