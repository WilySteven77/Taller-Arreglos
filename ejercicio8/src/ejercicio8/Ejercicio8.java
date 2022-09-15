
package ejercicio8;

import java.util.Scanner;


public class Ejercicio8 {

    
    public static void main(String[] args) {
       
        int N; 
        int mayor, menor;
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) +" Digite un numero" );
            numeros[i] = sc.nextInt();
        }
        mayor = menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(numeros [i] > mayor){
                mayor = numeros[i];
            }
            if(numeros [i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("El numero mayor es: " +mayor);
        System.out.println("El numero menor es: " +menor);
        
    }
    
}
