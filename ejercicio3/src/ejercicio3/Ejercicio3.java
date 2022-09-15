
package ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

   
    public static void main(String[] args) {
        
        float suma = 0, promedio;
        float[] numeros_reales = new float[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa 5 numeros reales");
        
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) +" Digite un numero" );
            numeros_reales[i] = sc.nextFloat();
            
            suma += numeros_reales[i];
            System.out.println("Su sumatoria seria: " +suma);
        }
        
        promedio = suma / numeros_reales.length;
        System.out.println("El promedio es: " +promedio);

       
    }
    
}
