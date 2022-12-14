
package ejerciciosderepaso_rodrigovasquez;

import java.util.Scanner; 

public class EjerciciosDeRepaso_RodrigoVasquez {

    public static void main(String[] args) {
        Scanner pengu = new Scanner(System.in); 
        System.out.print("1. Formar Palabra\n2. Numeros Primero\n3. Orden Alfabético\n4. Codificar\n5. Arreglos\nIngrese que ejercicio ejecutar: ");
        int choice = pengu.nextInt();
        do{
            switch(choice){
                case 1: 
                    System.out.print("Ingrese cadena#1: ");
                    String cadena1 = pengu.nextLine();
                    cadena1 = pengu.nextLine();
                    System.out.print("Ingrese cadena#2: ");
                    String cadena2 = pengu.nextLine();
                    formarPalabra(cadena1, cadena2);
                    break;
                case 2:
                    System.out.print("Ingrese una cadena de solo numeros y letras: ");
                    String cadenaNumeros = pengu.next(); 
                    numerosPrimero(cadenaNumeros);
                    break; 
                case 3: 
                    System.out.print("Ingrese una cadena: ");
                    String cadenaOrden = pengu.next(); 
                    ordenAlfabetico(cadenaOrden); 
                    break; 
                case 4: 
                    codificar(); 
                    break; 
                case 5: 
                    arreglos1(); 
                    break;
            }
        }while(choice>0&&choice<6);
    }
    
    public static void formarPalabra(String cadena1, String cadena2){
        int length1 = cadena1.length(); 
        int length2 = cadena2.length(); 
        boolean bandera = false;
        String acumPalabra = "";
        String newCadena1 = cadena1.replace(" ", "").toLowerCase(); 
        String newCadena2 = cadena2.replace(" ", "").toLowerCase();
        if(length1>length2){
            for (int i = 0; i < length2; i++) {
                for (int j = 0; j < length1; j++) {
                    if(newCadena1.charAt(i)==newCadena2.charAt(j)){
                        acumPalabra += newCadena2.charAt(j);
                    }
                }
            }
            if(acumPalabra.equalsIgnoreCase(newCadena2)){
                bandera = true; 
            }
        }else if(length2>length1){
            for (int i = 0; i < length1; i++) {
                for (int j = 0; j < length2; j++) {
                    if(newCadena2.charAt(i)==newCadena1.charAt(j)){
                        acumPalabra += newCadena1.charAt(j);
                    }
                }
            }
            if(acumPalabra.equalsIgnoreCase(newCadena1)){
                bandera = true; 
            }
        }
        if(bandera){
            System.out.println("Si se puede encontrar " + acumPalabra);
        }
    }
    
    public static void numerosPrimero(String cadena){
        String acumNumeros = "";
        String acumLetras = ""; 
        for (int i = 0; i < cadena.length(); i++) {
            int ASCII = (int)cadena.charAt(i);
            if(ASCII>47&&ASCII<58){
                acumNumeros += cadena.charAt(i); 
            }else{
                acumLetras += cadena.charAt(i);
            }
        }
        System.out.println(acumNumeros + acumLetras);
    }
    
    public static void ordenAlfabetico(String cadena){
        int cont = 0; 
        String acumCadena = ""; 
        String cadena2 = cadena.toLowerCase();
        for (int i = 97; i < 123; i++) {
            for (int j = 0; j < cadena2.length(); j++) {
                int charInt = (int)cadena2.charAt(j);
                if(charInt==i){
                    acumCadena += cadena2.charAt(j);
                }else if(charInt>47&&charInt<58){
                    cont++; 
                }
            }
        }
        System.out.println(acumCadena);
        System.out.println("Numeros dentro de la cadena: " + cont);
    }
    
    public static void codificar(){
        Scanner tiresome = new Scanner(System.in);
        System.out.print("Entrada: ");
        String cadena = tiresome.nextLine(); 
        String acumCadena = ""; 
        for (int i = 0; i < cadena.length(); i++) {
            int charCadena = (int)cadena.charAt(i); 
            if(charCadena>96&&charCadena<123){
                    acumCadena += charCadena - 96; 
                    if(i+1<cadena.length()&&charCadena!=32){
                        acumCadena += '-'; 
                    }
            }else if(charCadena>47&&charCadena<58){
                char caracter = cadena.charAt(i);
                switch(caracter){
                    case 1: 
                        acumCadena += "A";
                        break; 
                    case 2: 
                        acumCadena += "B";
                        break; 
                    case 3: 
                        acumCadena += "C";
                        break; 
                    case 4: 
                        acumCadena += "D";
                        break; 
                    case 5: 
                        acumCadena += "E";
                        break; 
                    case 6: 
                        acumCadena += "F";
                        break; 
                    case 7: 
                        acumCadena += "G";
                        break; 
                    case 8: 
                        acumCadena += "H";
                        break; 
                    case 9: 
                        acumCadena += "I";
                        break; 
                }
                if(i+1<cadena.length()&&cadena.charAt(i+1)!=' '){
                        acumCadena += '-'; 
                }
            }else if(charCadena==32){
                acumCadena += cadena.charAt(i);
                if(i+1<cadena.length()&&cadena.charAt(i+1)!=' '){
                        acumCadena += '-'; 
                }
            }
        }
        System.out.println(acumCadena);
    }
    
    public static void arreglos1 (){
        Scanner pingu = new Scanner(System.in);
        int[] arreglo1 = new int[10]; 
        int length = arreglo1.length; 
        for (int i = 0; i < length; i++) {
            System.out.print("Ingrese un número: ");
            arreglo1[i] = pingu.nextInt(); 
        }
        for (int i = 0; i < length; i++) {
            System.out.println(arreglo1[i]);
        }
    }
    
    public static void arreglos2(){
       arreglos1(); 
    }
}
