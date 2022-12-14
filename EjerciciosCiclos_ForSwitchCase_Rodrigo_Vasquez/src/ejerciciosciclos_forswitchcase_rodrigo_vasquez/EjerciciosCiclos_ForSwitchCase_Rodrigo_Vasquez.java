
package ejerciciosciclos_forswitchcase_rodrigo_vasquez;

import java.util.Scanner;

public class EjerciciosCiclos_ForSwitchCase_Rodrigo_Vasquez {

    public static void main(String[] args) {
        Scanner ring = new Scanner(System.in);
        int firstChoice = 0;
        do{
            System.out.println("1. ¿Cuántos números pares e impares hay entre este rango?");
            System.out.println("2. Triángulos y más Triángulos");
            System.out.println("3. Anita lava la tina");
            System.out.println("4. Codigos secretos");
            System.out.print("¿A qué ejercicio desea ingresar? ");
            firstChoice = ring.nextInt();
            if(firstChoice==1){
                System.out.print("Ingrese un numero: ");
                int num = ring.nextInt(); 
                int contPares = 0;
                int contImpares = 0;
                String test = ""; 
                String test2 = "";
                for(int i=0;i<=num;i++){
                    //Incremento de contadores
                    if(i%2==0){
                        test = test + i + ", ";
                        contPares++;
                    }else{
                        test2 = test2 + i + ", ";
                        contImpares++;
                    }
                }
                System.out.println("Entre 0 y " + num + " existen " + contPares + " números pares y estos son: " + test);
                System.out.println("Entre 0 y " + num + " existen " + contImpares + " números impares y estos son: " + test2); 
            }else if(firstChoice==2){
                int choice = 0;
                do{
                    System.out.println("1. Triángulo Equilátero");
                    System.out.println("2. Triángulo Rectángulo");
                    System.out.print("¿A cuál desea ingresar? ");
                    choice = ring.nextInt();
                    if(choice==1){
                        System.out.print("Ingrese la altura del triángulo: ");
                        int alt = ring.nextInt();
                        for(int i = 1; i <= alt; i++){
                            for(int j = 1; j <= alt-i; j++){
                                System.out.print(" ");
                            }for(int l = 1; l <= i; l++){
                                System.out.print("* ");
                            }     
                            System.out.println("");
                        }
                    }else if(choice==2){
                        System.out.print("Ingrese la altura del triángulo: ");
                        int alt = ring.nextInt();
                        int cont = 0;
                        for(int i = 0; i < alt; i++){
                            for(int j = 0; j <= cont; j++){
                                System.out.print("*");
                            }
                            cont++;
                            System.out.println("");
                        }
                    }
                }while(choice==2&&choice==1);
            }else if(firstChoice==3){
                System.out.print("Ingrese el texto: ");
                String text = ring.nextLine();
                String newText = text.replace(" ", "").replace(",","").replace(".","");
                String inverse = new StringBuilder(newText).reverse().toString();                 
                if(newText.equalsIgnoreCase(inverse))
                    System.out.println("Es una palabra/oración palíndroma");
                else 
                    System.out.println("No es una palabra/oración palíndroma");
            }else if(firstChoice==4){
                System.out.print("Entrada: ");
                String entrada = ring.next();
                int largo = entrada.length(); 
                int posicion = 0;
                String clave = "";
                int num = 0;
                for(int i = 1; i < largo; i += 2){
                    char r = entrada.charAt(i);
                    char t = entrada.charAt(posicion);
                    clave = Character.toString(r);
                    num = Integer.parseInt(clave);
                    for(int j = 0; j < num; j++){
                        System.out.print(t);
                    }
                    posicion += 2; 
                }
                System.out.println("");
            }
        }while(firstChoice<5&&firstChoice>0);        
}
    
}
