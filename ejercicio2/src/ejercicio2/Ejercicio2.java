
package ejercicio2;


public class Ejercicio2 {

    
    public static void main(String[] args) {
        
        int [] pares = new int[100];
        
        int numero_par, i;
        for (i = 0, numero_par = 2; i < 100; i++, numero_par += 2) {
            pares[i] = numero_par;
        }
        
        System.out.println("Se imprimira en una sola linea");
        
        for (i = 0; i < pares.length/2; i++) 
        {
            
           System.out.print(pares[i] + "  "); 
           
        }  
        
        for (i = 0; i < pares.length/2; i++) 
        {
            
           System.out.print(pares[i] + "  "); 
           
        }  
        
    }
    
}
