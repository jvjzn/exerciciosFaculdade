public class Combinador {

    public static void main(String[] args) {

        String linha;
        String separador[];
        String y;
            
        while ((linha = MyIO.readLine()) != null && !linha.equals("FIM")){
        separador = linha.split(" ");

        y = comb (separador[0],separador[1]);
        System.out.println(y);
    }

    }   
    public static String comb(String a, String b){
        
        String resultado = "";
        boolean continuar = true;
        
        for(int contador= 0; continuar; contador++){
            continuar = false;
            
            if(contador < a.length()){
                resultado += a.charAt(contador);
                continuar = true;
            }
            if(contador < b.length()){
                resultado += b.charAt(contador);
                continuar = true;
            }
        }
        return(resultado);
    }   
}