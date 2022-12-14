package pruebapractica.pkg2_rodrigovasquez;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaPractica2_RodrigoVasquez {

    public static void main(String[] args) {
        Scanner theEnd = new Scanner(System.in);
        Scanner rainDance = new Scanner(System.in);
        Scanner faith = new Scanner(System.in);
        ArrayList<Figura> geometryList = new ArrayList<Figura>();
        System.out.println("--------------- B I E N V E N I D O S ---------------");
        char choice = 's';
        do {
            System.out.println("Figuras disponibles:");
            System.out.println("1. Cuadrado\n2. Triángulo\n3. Rectángulo");
            System.out.print("Ingrese una figura: ");
            String figura = rainDance.next().toLowerCase();
            switch (figura) {
                case "triangulo":
                    System.out.print("Ingrese una altura: ");
                    double alto = faith.nextDouble();
                    System.out.print("Ingrese el largo: ");
                    double largo = faith.nextDouble();
                    System.out.print("Ingrese el ancho: ");
                    double ancho = faith.nextDouble();
                    //Valido la altura, longitud, y anchura para que no aparezcamn numeros negativos
                    if (alto > 0 && largo > 0 && ancho > 0) {
                        geometryList.add(new Figura(largo, alto, ancho, figura));
                    } else {
                        System.out.println("Los numeros no pueden ser negativos");
                    }
                    break;
                case "cuadrado":
                    System.out.print("Ingrese una altura: ");
                    alto = faith.nextDouble();
                    System.out.print("Ingrese el largo: ");
                    largo = faith.nextDouble();
                    System.out.print("Ingrese el ancho: ");
                    ancho = faith.nextDouble();
                    if (alto > 0 && largo > 0 && ancho > 0) {
                        geometryList.add(new Figura(largo, alto, ancho, figura));
                    } else {
                        System.out.println("Los numeros no pueden ser negativos");
                    }
                    break;
                case "rectangulo":
                    System.out.print("Ingrese una altura: ");
                    alto = faith.nextDouble();
                    System.out.print("Ingrese el largo: ");
                    largo = faith.nextDouble();
                    System.out.print("Ingrese el ancho: ");
                    ancho = faith.nextDouble();
                    if (alto > 0 && largo > 0 && ancho > 0) {
                        geometryList.add(new Figura(largo, alto, ancho, figura));
                    } else {
                        System.out.println("Los numeros no pueden ser negativos");
                    }
                    break;
                default:
                    System.out.println("Figura Invalida");
                    break;
            }
            System.out.print("¿Desea ingresar otra figura? [S/N]: ");
            choice = theEnd.next().charAt(0);
        } while (choice == 's' || choice == 'S');
        for (Figura figura : geometryList) {
            System.out.println(figura.toString());
            System.out.println("Area: " + figura.area() + "    Volumen: " + figura.volumen());
            //Pense en utilizar otro ArrayList para el area y volumen, pero luego me recorde que solo podia llamar el método
        }
        System.out.println("-----------------------------------------------------");
        
    }

}
