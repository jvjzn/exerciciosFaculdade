package pacote;

//João Vitor Bessa Lacerda 
public class Recursivo {

    public static int contador(String input) {
    
        int m = 0;
    
        for(int cont = 0; cont < input.length(); cont++){
            char c = input.charAt(cont);

            if (Character.isUpperCase(c)){
                m++;    
            }            
        }
    
        return m;
    }

    public static void main(String[] args){

        int maiusculas;
        String input = MyIO.readLine();

        while(!input.equals("FIM")){
            maiusculas = contador(input);
            System.out.println(maiusculas);
            input = MyIO.readLine();
        }
    }
}