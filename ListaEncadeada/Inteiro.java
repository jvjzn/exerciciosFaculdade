public class Inteiro {
    private int valor;

    public Inteiro(int valor){
        this.valor = valor;
    }

    public Inteiro(){
        this.valor = 0;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    public void imprimirInteiro(){
        System.out.println("Valor ->" + valor);
    }
}
