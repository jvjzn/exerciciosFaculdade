package org.example;

import java.util.Calendar;
import java.util.Locale;

public class Data {

    private int dia, mes, ano;

    Data(int dia, int mes, int ano) throws ExcecaoDataInvalida{
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) throws ExcecaoDataInvalida {
        if (dia <= 0 || dia > 31){
            throw new ExcecaoDataInvalida("Dia inválido: " + dia);
        }
        this.dia = dia;
    }

    public void setMes(int mes) throws ExcecaoDataInvalida {
        if ( mes <= 0 || mes > 12){
            throw new ExcecaoDataInvalida("Mês inválido: " + mes);
        }
        this.mes = mes;
    }

    public void setAno(int ano) throws ExcecaoDataInvalida{
        if (ano < 0){
            throw new ExcecaoDataInvalida("Ano inválido: " + ano);
        }
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public void adicionaDias(int i) {
        this.dia += i;
    }

    public void proximoDia() {
        if ((diasNoMes() == 30 && this.dia == 30) || diasNoMes() == 28 && this.dia == 28){
            this.dia = 1;
            this.mes += 1;
        } else if (diasNoMes() == 31 && this.dia == 31){
            this.dia = 1;
            if (this.mes == 12){
                this.mes = 1;
            } else {
                this.mes += 1;
            }
        } else {
            this.dia += 1;
        }

    }

    public int diasNoMes() {

        if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
            return 30;
        }
        if (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) {
            return 31;
        } else {
            return 28;
        }

        /*int[] mesesTrinta = {4,6,9,11};
        int[] mesesTrintaUm = {1,3,5,7,8,10,12};
        if (Arrays.asList(mesesTrinta).contains(this.mes)){
            return 30;
        } if (Arrays.asList(mesesTrintaUm).contains(this.mes)){
            return 31;
        }else {
            return 28;
        }*/
    }

    public boolean eAnoBisexto() {
        return this.ano % 4 == 0 && this.ano % 400 == 0;
    }


    public String diaDaSemana() {

        Calendar calendario = Calendar.getInstance();
        calendario.set(this.ano, this.mes - 1, this.dia);

        Locale idioma = new Locale("pt", "BR");

        return calendario.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, idioma);
    }


    public String porExtenso() {

        Calendar calendario = Calendar.getInstance();
        calendario.set(this.ano, this.mes - 1, this.dia);
        Locale idioma = new Locale("pt", "BR");

        String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        String[] centenas = {"cem", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
        String[] milhares = {"e", "mil", "dois mil"};

        String diaPorExtenso = "";
        String anoPorExtenso = "";

        //dia == 1 ... 19
        if (this.dia < 20) {
            diaPorExtenso = unidades[this.dia];

        }
        //dia == 20 ... 99
        else if (this.dia < 100) {
            int dezena = this.dia / 10;
            int unidade = this.dia % 10;
            //dia == 20,30,40,50,60,70,80,90
            if (unidade == 0) {
                diaPorExtenso = dezenas[dezena];
            }
            //dia == X1,X2,X3,X4,X5,X6,X7,X8,X9
            else if (unidade > 0) {
                diaPorExtenso = dezenas[dezena] + " e " + unidades[unidade];

                //ano == 1000
            }
        }

        if (this.ano > 999) {
            int milhar = this.ano / 1000;
            anoPorExtenso = milhares[milhar];

            int centena = (this.ano / 100) % 10;
            int duasUltimasCasas = this.ano % 100;


            if ((centena == 1) && (duasUltimasCasas == 0)) {
                anoPorExtenso += " e " + centenas[0];
            } else if ((centena > 0)){
                anoPorExtenso += " " + centenas[centena];
            }
            if (duasUltimasCasas < 20) {
                anoPorExtenso += " e " + unidades[duasUltimasCasas];
            } else {
                int dezena2 = (this.ano % 100) / 10;
                int unidade2 = this.ano % 10;
                anoPorExtenso += " e " + dezenas[dezena2] + " e " + unidades[unidade2];
            }

        }

        String mesPorExtenso = calendario.getDisplayName(Calendar.MONTH, Calendar.LONG, idioma);


        return diaPorExtenso + " de " + mesPorExtenso + " de " + anoPorExtenso;
    }
}
