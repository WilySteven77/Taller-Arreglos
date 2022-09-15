
package ejercicio9;

import java.util.Scanner;


public class Ejercicio9 {

    
    public static void main(String[] args) {
        int n_ingresados;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros desea ingresar");
        n_ingresados = sc.nextInt();
        int[] n = new int[n_ingresados];
        int[] f = new int[n_ingresados];
        System.out.println("Ingrese numeros");
        
        for (int i = 0; i < n.length; i++) {
            System.out.println((i+1) +" Digite un numero" );
            n[i] = sc.nextInt();
        }
        //forma decrecinete
        System.out.println("Manera descendente");
         for (int i = n.length - 1; i >= 0; i--) {
            System.out.println("Valor [" + i + "]"+ " " + n[i]);
            f[i] = n[i];
        }
         System.out.println("El arreglo final es:");
         
         for (int i = n.length - 1; i >= 0; i--) {
            System.out.println("Valor [" + i + "]"+ " " + n[i]);
            f[i] = n[i];
        }
        
    }
    
}
