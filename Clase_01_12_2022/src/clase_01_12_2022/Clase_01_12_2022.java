package clase_01_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Clase_01_12_2022 {

    public static void main(String[] args) {
        Scanner kimHajin = new Scanner(System.in);
        /*ArrayList<int> numList = new ArrayList();
        System.out.println("< B I E N V E N I D O >");
        char choice = 's';
        do {
            System.out.print("Ingrese un numero: ");
            int num = kimHajin.nextInt();
            numList.add(num);
            System.out.print("¿Desea ingresar otro numero? [S/N]: ");
            choice = kimHajin.next().charAt(0);
        } while (choice == 's' || choice == 'S');
        int cont = 0; 
        for (int i = 0; i < numList.size(); i++) {
            for (int j = 0; j < numList.size(); j++) {
                if (i > j) {
                    cont += j; 
                } else if (i < j) {
                    cont += i; 
                }
            }
        }*/
        int[] numLista = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            int num = kimHajin.nextInt();
            numLista[i] = num; 
        }
        System.out.print("Ingrese el valor que quiere buscar: ");
        int numBuscado = kimHajin.nextInt();

    }

    public static int busquedaBinaria(int numBuscado, int[] numLista) {
        int inicio = 0;
        int fin = numLista.length - 1;
        int posicion;
        while (inicio <= fin) {
            posicion = (inicio + fin) / 2;
            if (numLista[posicion] == numBuscado) {
                return posicion;
            } else if (numBuscado > numLista[posicion]) {
                inicio = posicion + 1; 
            } else {
                fin = posicion - 1; 
            }
        }
        re|turn; 
    }

}
