
package ejercicios_metodosstrings_rodrigovasquez;

import java.util.Scanner; 

public class Ejercicios_MetodosStrings_RodrigoVasquez {

    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        int choice = 0; 
        do{
            System.out.println("1. Replace \n2. Factorial \n3. Mensajes \n4. Promedios \n5. Aprobado o Reprobado \n6. Contain");
            System.out.print("Ingrese que ejercicio desea ejecutar: ");
            choice = mainScanner.nextInt(); 
            switch(choice){
                    case 1: 
                        System.out.print("Ingrese la cadena: ");
                        String cadena = mainScanner.next(); 
                        System.out.print("Ingrese caracter a remplazar: ");
                        String remplazado1 = mainScanner.next(); 
                        char remplazado = remplazado1.charAt(0);
                        System.out.print("Ingrese caracter que remplaza: ");
                        String remplazador1 = mainScanner.next();
                        char remplazador = remplazador1.charAt(0);
                        System.out.println(metodoRemplazo(cadena, remplazado, remplazador));
                        break; 
                    case 2: 
                        System.out.print("Ingrese un numero: ");
                        int num = mainScanner.nextInt(); 
                        System.out.println(factorial(num)); 
                        break;
                    case 3: 
                        System.out.print("Ingrese una cadena: ");
                        String cadena2 = mainScanner.nextLine(); 
                        mensajes(cadena2);
                        break;
                    case 4: 
                        System.out.println(promedios());
                        break; 
                    case 5: 
                        System.out.print("Ingrese la nota del alumno: ");
                        int numNota = mainScanner.nextInt(); 
                        System.out.println(aprobado(numNota));
                        break;
                    case 6: 
                        System.out.print("Ingrese cadena principal: ");
                        String cadenaPrincipal = mainScanner.nextLine();
                        System.out.print("Ingrese cadena secundaria: ");
                        String cadenaSecun = mainScanner.nextLine(); 
                        System.out.println(contains(cadenaPrincipal, cadenaSecun));
                        break; 
            }
                        
        }while(choice>0&&choice<7);
    }
    public static String metodoRemplazo (String cadena, char remplazado, char remplazador){
        String newString = ""; 
        int length = cadena.length(); 
        for (int i = 0; i < length; i++) {
            char newChar = cadena.charAt(i); 
            if(newChar==remplazado){
                newString += remplazador;
            }else{
                newString += newChar;
            }
        }
        return newString;
    }
    
    public static int factorial (int numFactorial){
        int factor = 1; 
        for (int i = 1; i <= numFactorial; i++) {
            factor*=1; 
        }
        return factor; 
    }
    
    public static void mensajes (String entrada){
        System.out.println(entrada);
    }
    
    public static double promedios (){
        Scanner michaelBuble = new Scanner(System.in); 
        System.out.print("Ingrese nota #1: ");
        int nota1 = michaelBuble.nextInt(); 
        System.out.print("Ingrese nota #2: ");
        int nota2 = michaelBuble.nextInt();
        System.out.print("Ingrese nota #3: ");
        int nota3 = michaelBuble.nextInt();
        System.out.print("Ingrese nota #4: ");
        int nota4 = michaelBuble.nextInt();
        int notaTotal = nota1 + nota2 + nota3 + nota4; 
        double promedio = notaTotal / 4; 
        return promedio; 
    }
    
    public static boolean aprobado(int nota){
        boolean aprobado = true;
        if(nota>=60){
            System.out.println("El alumno aprobó");
            return aprobado; 
        }else{
            System.out.println("El alumno rebrobó");
            aprobado = false;
            return aprobado;
        }
    }
    
    public static boolean contains(String cadena1, String cadena2){
        int length = cadena1.length(); 
        int length2 = cadena2.length(); 
        boolean contenido = true;
        String acum1 = "";
        String acum2 = ""; 
        for (int i = 0; i <length; i++) {
            for (int j = 0; j <length2; j++) {
                char cadena1Char = cadena1.charAt(i);
                char cadena2Char = cadena2.charAt(j);
                if(cadena1Char==cadena2Char){
                    acum1 += cadena1Char;
                }
            }
        }
        if(acum1.equalsIgnoreCase(cadena2)){
            return contenido; 
        }else{
            contenido = false; 
            return contenido; 
        }
    }
}
