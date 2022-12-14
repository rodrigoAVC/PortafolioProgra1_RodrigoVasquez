
package prueba1_rodrigovasquez;

import java.util.Scanner;

public class Prueba1_RodrigoVasquez {
    
    public static void main(String[] args) {
        Scanner overlord = new Scanner(System.in); 
        int cont = 0;
        int choice = 0; 
        // Las variables que mantienen el while deben de estar afuera, sino el código no funciona
        do{
            System.out.println("Bienvenido a mi prueba práctica en Java, las opciones son las siguientes: ");
            System.out.println("1. Repetir mi nombre");
            System.out.println("2. SubMenu de mensajes");
            System.out.println("3. Salir");
            System.out.print("¿A cuál desea ingresar? ");
            choice = overlord.nextInt(); 
            switch(choice){
                case 1: System.out.print("¿Cuántas veces desea que se repita el texto? ");
                        int numText = overlord.nextInt(); 
                        for(int i = 0; i < numText; i++){
                            String nombreEstudiante = "Rodrigo Vásquez";
                            // Utilize una variable para el nombre porque así está descrito en el papel de la prueba-
                            System.out.println("¡Hola mi nombre es " + nombreEstudiante + " y miren mi prueba!");
                        }
                        cont++; 
                        // Los contadores solo aumentan en el case 1 y 2, ya que el case 3 es la salida y por ende solo aparece una vez
                        break;
                case 2: int choice2 = 0; 
                        do{
                            System.out.println("1. Bienvenida");
                            System.out.println("2. Despedida");
                            System.out.println("3. Sálida");
                            System.out.print("Ingrese operación a utilizar: ");
                            choice2 = overlord.nextInt(); 
                            if(choice2==1)
                                System.out.println("Bienvenido al ejercicio #2 de mi prueba de Progra 1");
                            else if(choice2==2)
                                System.out.println("Hasta luego, gracias por usar mi programa");
                        }while(choice2!=3); 
                        cont++;
                        break;
                case 3: System.out.println("Adiós, está fue mi prueba");
                        System.out.println(cont);
                        break;
            }
        }while(choice!=3); 
    }
    
}
