
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        
        int suma = 0, promedio, mediana;
        int[] edades = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa 5 numeros reales");
        
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) +" Digite un numero" );
            edades[i] = sc.nextInt();
            
            suma += edades[i];
            System.out.println("Su sumatoria seria: " +suma);
        }
        promedio = suma / edades.length;
        System.out.println("El promedio de edades de los estudiantes es: " +promedio);
        
        int mitad;
        mitad = edades.length / 2;
        System.out.println("mita " +mitad);
        
        if(edades.length % 2 == 0){
            mediana = (edades[mitad -1] + edades[mitad]) /2;
            System.out.println(mediana);
        }else {
            mediana = edades[mitad];
            System.out.println(mediana);
        }
    }
    
}
