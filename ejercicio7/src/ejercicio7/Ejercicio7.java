
package ejercicio7;

import java.util.Scanner;


public class Ejercicio7 {

    
    public static void main(String[] args) {
        int n_ingresados;
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros desea ingresar");
        n_ingresados = sc.nextInt();
        int[] n = new int[n_ingresados];
        System.out.println("Ingrese numeros");
        
        for (int i = 0; i < n.length; i++) {
            System.out.println((i+1) +" Digite un numero" );
            n[i] = sc.nextInt();
            
            while (n[i] != 0) {                
                factorial = factorial * n[i]; 
                n[i]--;
            }
            System.out.println("Factorial es:" +factorial);
        }
        int[] arreglo_final = {n_ingresados,factorial};
            for (int j = 0; j < arreglo_final.length; j++) {
            System.out.println("Valor [" + j + "]"+ " " + arreglo_final[j]);
            }
        
            

    }
    
}
