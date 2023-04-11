package Ej1Service;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    Persona persona = new Persona();

    public boolean esMayorDeEdad() {
        boolean mayor;
        if (persona.getEdad() > 18) {
            System.out.println("La persona es mayor de edad");
            mayor = true;
        } else {
            System.out.println("La persona es menor de edad");
            mayor = false;
        }
        return mayor;
    }

    public void crearPersona() {
        System.out.println("Ingrese el nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo");
        persona.setSexo(leer.next());
        while (!persona.getSexo().equalsIgnoreCase("m") && !persona.getSexo().equalsIgnoreCase("h") && !persona.getSexo().equalsIgnoreCase("o")) {
            System.out.println("Respuesta invalida,intente de nuevo");
            persona.setSexo(leer.next());
        }

        System.out.println("Ingrese la altura en Cm");
        persona.setAltura(leer.nextInt());
        System.out.println("Ingrese el peso en Kg");
        persona.setPeso(leer.nextInt());

    }

    public int calcularIMC() {
        int retorno=0;
        double pesoideal = persona.getPeso() / ((persona.getAltura() / 100)*(persona.getAltura() / 100));
        if (pesoideal < 20) {
            retorno = -1;
        }
        if (pesoideal >= 20 && pesoideal <= 25) {
            retorno = 0;
        }
        if (pesoideal > 25) {
            retorno = 1;
        }
        return retorno;
    }

}
