public class Inteiro {
    private int valor;

    Inteiro(int valor){
        this.valor = valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    public void imprimirInteiro(){
        System.out.println("Valor -> " + this.valor);
    }
}
