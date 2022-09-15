
package ejercicio5;


public class Ejercicio5 {

   
    public static void main(String[] args) {
        
        int suma = 0;
        int suma_impares = 0;
        int suma_total = 0;
        int[] pares = {2,4,6,8};
        int[] impares = {1,3,5,7};
        
        for (int i = 0; i < 4; i++) {
            suma += pares[i];
        }
        System.out.println("La suma de pares es: " +suma);
        
        for (int i = 0; i < 4; i++) {
            suma_impares += impares[i]; 
        }
        System.out.println("La suma de impares es: " +suma_impares);
        
        int[] total = {suma_impares, suma};
        for (int i = 0; i < total.length; i++) {
            suma_total += total[i];
            System.out.println("Valor [" + i + "]"+ " " + total[i]);
        }
        System.out.println("La suma de total es: " +suma_total);
    }
    
}
