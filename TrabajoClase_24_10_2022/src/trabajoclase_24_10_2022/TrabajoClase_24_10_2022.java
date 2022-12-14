
package trabajoclase_24_10_2022;

import java.util.Scanner;

public class TrabajoClase_24_10_2022 {

    public static void main(String[] args) {
        Scanner gate = new Scanner(System.in);
        System.out.print("Ingrese el numero de mes: ");
        int mes = gate.nextInt();
        System.out.print("Ingrese el año: "); 
        int año = gate.nextInt();
        switch(mes){
            case 1: 
            case 3:
            case 5:
            case 7:
            case 8: 
            case 10: 
            case 12: 
                System.out.println("Tiene 31 dias");
                break; 
            case 4: 
            case 6:
            case 9:
            case 11: 
                System.out.println("Tiene 30 dias");
                break;
            case 2: 
                int mod = año % 4;
                if(mod==0)
                    System.out.println("Tiene 29 dias");
                else
                    System.out.println("Tiene 28 dias");
                break; 
            default: 
                System.out.println("Mes ingresado no valido");
        }
    }
    
}
