public class Inteiro {
    private int valor;
    
    public Inteiro(){
        valor = 0;
    }

    public Inteiro(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void imprimirInteiro(){
        System.out.println("Valor ->" + valor);
    }
}
