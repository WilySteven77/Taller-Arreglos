
package ejercicio10;

import java.util.Scanner;


public class Ejercicio10 {

   
    public static void main(String[] args) {
        
        int n_ingresados;
        int suma = 0, suma_total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros desea ingresar");
        n_ingresados = sc.nextInt();
        int[] n = new int[n_ingresados];
        int[] f = new int[n_ingresados];
        System.out.println("Ingrese numeros");
        
        for (int i = 0; i < n.length; i++) {
            System.out.println((i+1) +" Digite un numero" );
            n[i] = sc.nextInt();
            
            suma += n[i];
            System.out.println("Su sumatoria seria: " +suma);
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println("Valor [" + i + "]"+ " " + n[i]);
            f[i] = n[i];
        }
        
    }
    
}
