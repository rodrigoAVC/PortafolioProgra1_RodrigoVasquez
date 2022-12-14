
package ejerciciosrepaso_rodrigovasquez;

import java.util.Scanner; 

public class EjerciciosRepaso_RodrigoVasquez {

    public static void main(String[] args) {
        Scanner pengu = new Scanner(System.in); 
        System.out.println("Hola: ");
        int choice = pengu.nextInt();
        if(choice==5){
            arreglos1(); 
        }
    }
    
    public static void arreglos1 (){
        Scanner pingu = new Scanner(System.in);
        int[] arreglo1 = new int[10]; 
        int length = arreglo1.length; 
        for (int i = 0; i < length; i++) {
            System.out.print("Ingrese un número: ");
            arreglo1[i] = pingu.nextInt(); 
        }
        System.out.println(arreglo1[5]);
    }
}
