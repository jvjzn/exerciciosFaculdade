package pacote;

//João Vitor Bessa Lacerda
public class Iterativo {
    public static void main(String[] args){
        int maiuscula = 0;   
        
        String input = MyIO.readLine();

        while(!input.equals("FIM")){
            for (int c = 0; c < input.length(); c++){          
                char letra = input.charAt(c);               
                if (Character.isUpperCase(letra)){                
                    maiuscula++;
                }
            }

            System.out.println(maiuscula);
            maiuscula = 0;
            input = MyIO.readLine();
        }
    
    }
}