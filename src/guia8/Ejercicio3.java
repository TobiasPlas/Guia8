package guia8;

import Ej1Service.PersonaServicio;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        PersonaServicio persona1 = new PersonaServicio();
        PersonaServicio persona2 = new PersonaServicio();
        PersonaServicio persona3 = new PersonaServicio();
        PersonaServicio persona4 = new PersonaServicio();
        int contadorMayor = 0;
        int contadorBajoPeso = 0;
        int contadorPesoIdeal = 0;
        int contadorSobrePeso = 0;

        System.out.println("Crear persona 1 ");
        persona1.crearPersona();

        switch (persona1.calcularIMC()) {
            case -1:
                contadorBajoPeso++;
                break;
            case 0:
                contadorPesoIdeal++;
                break;
            case 1:
                contadorSobrePeso++;
                break;
        }
        if (persona1.esMayorDeEdad()) {
            contadorMayor++;
        }
        System.out.println("Crear persona 2 ");
        persona2.crearPersona();

        switch (persona2.calcularIMC()) {
            case -1:
                contadorBajoPeso++;
                break;
            case 0:
                contadorPesoIdeal++;
                break;
            case 1:
                contadorSobrePeso++;
                break;
        }
        if (persona2.esMayorDeEdad()) {
            contadorMayor++;
        }
        System.out.println("Crear persona 3 ");
        persona3.crearPersona();

        switch (persona3.calcularIMC()) {
            case -1:
                contadorBajoPeso++;
                break;
            case 0:
                contadorPesoIdeal++;
                break;
            case 1:
                contadorSobrePeso++;
                break;
        }
        if (persona3.esMayorDeEdad()) {
            contadorMayor++;
        }
        System.out.println("Crear persona 4 ");
        persona4.crearPersona();

        switch (persona4.calcularIMC()) {
            case -1:
                contadorBajoPeso++;
                break;
            case 0:
                contadorPesoIdeal++;
                break;
            case 1:
                contadorSobrePeso++;
                break;
        }
        if (persona4.esMayorDeEdad()) {
            contadorMayor++;
        }

        System.out.println("Porcentaje de las personas con bajo peso "+contadorBajoPeso*100/4);
        System.out.println("Porcentaje de las personas con peso ideal "+contadorPesoIdeal*100/4);
        System.out.println("Porcentaje de las personas con sobre peso "+contadorSobrePeso*100/4);
        System.out.println("Porcentaje de las personas mayores de edad  "+contadorMayor*100/4);
        
        
        
    }

}
