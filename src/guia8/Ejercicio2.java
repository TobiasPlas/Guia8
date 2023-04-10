package guia8;

import Ej1Service.CafeteraServicio;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        CafeteraServicio cafetera = new CafeteraServicio();
        
        
        
        boolean salir = false;
         int entrada;

        do {
            System.out.println("NESPRESSO NOBODY");
            System.out.println("Que operacion desea realizar?");
            System.out.println("1 - Programar cafetera");
            System.out.println("2 - Llenar cafetera");
            System.out.println("3 - Servir taza");
            System.out.println("4 - Vaciar cafetera");
            System.out.println("5 - Agregar cafe");
            System.out.println("6 - Salir");
            entrada = leer.nextInt();

            switch (entrada) {
                case 1:
                    cafetera.setearCafetera();
                    break;
                case 2:
                    cafetera.llenarCafetera();
                    break;
                case 3:
                    cafetera.servirTaza();
                    break;
                case 4:
                    cafetera.vaciarCafetera();
                    break;
                case 5:
                    cafetera.agregarCafe();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Dato invalido");
                            
            }

            leer.nextLine();

        } while (salir == false);
    }

}


