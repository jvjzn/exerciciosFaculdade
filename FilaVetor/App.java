public class App {
    public static void main(String[] args) throws Exception {
        
        fila minhaFila;
        Inteiro elemento;
        Inteiro desenfileirado;

        minhaFila = new fila(10);
        
        
        elemento = new Inteiro(1);

        try{ 
            minhaFila.enfileirar(elemento);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        elemento = new Inteiro(2);

        try{ minhaFila.enfileirar(elemento);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        elemento = new Inteiro(3);

        try{ minhaFila.enfileirar(elemento);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        elemento = new Inteiro(4);

        try{ 
            minhaFila.enfileirar(elemento);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        elemento = new Inteiro(5);

        try{ minhaFila.enfileirar(elemento);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        elemento = new Inteiro(6);

        try{ minhaFila.enfileirar(elemento);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        elemento = new Inteiro(7);

        try{ 
            minhaFila.enfileirar(elemento);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        elemento = new Inteiro(8);

        try{ minhaFila.enfileirar(elemento);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        elemento = new Inteiro(9);

        try{ minhaFila.enfileirar(elemento);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try { 
            desenfileirado = minhaFila.desenfileirar();
            System.out.println("desenfileirado: ");
            desenfileirado.imprimirInteiro();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try { 
            desenfileirado = minhaFila.desenfileirar();
            System.out.println("desenfileirado: ");
            desenfileirado.imprimirInteiro();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        try { 
            desenfileirado = minhaFila.desenfileirar();
            System.out.println("desenfileirado: ");
            desenfileirado.imprimirInteiro();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        elemento = new Inteiro(10);


        try{ 
            minhaFila.enfileirar(elemento);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        elemento = new Inteiro(11);

        try{ minhaFila.enfileirar(elemento);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        elemento = new Inteiro(12);

        try{ minhaFila.enfileirar(elemento);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        
		
        try { 
            desenfileirado = minhaFila.desenfileirar();
            System.out.println("desenfileirado: ");
            desenfileirado.imprimirInteiro();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        try{ minhaFila.imprimir();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}
