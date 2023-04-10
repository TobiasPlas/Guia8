package Ej1Service;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);
    Cafetera cafetera = new Cafetera();

    public void setearCafetera() {
        System.out.println("Ingrese la capacidad maxima de la cafetera en ml");

        cafetera.setCapacidadMáxima(leer.nextInt());

    }

    public void llenarCafetera() {

        cafetera.setCantidadActual(cafetera.getCapacidadMáxima());
    }

    public void servirTaza() {
        System.out.println("Elija el tamaño de la taza");
        System.out.println("1)Pequeña 120ml");
        System.out.println("2)Mediana 200ml");
        System.out.println("3)Grande 300ml");
        int taza = leer.nextInt();

        switch (taza) {

            case 1:
                if (cafetera.getCantidadActual() > 120) {
                    cafetera.setCantidadActual(cafetera.getCantidadActual() - 120);
                } else {
                    System.out.println("El cafe contiene " + cafetera.getCantidadActual() + "ml devido a que la cafetera se quedo sin cafe");
                    cafetera.setCantidadActual(0);
                }
                break;
            case 2:
                if (cafetera.getCantidadActual() > 200) {
                    cafetera.setCantidadActual(cafetera.getCantidadActual() - 200);
                } else {
                    System.out.println("El cafe contiene " + cafetera.getCantidadActual() + "ml devido a que la cafetera se quedo sin cafe");
                    cafetera.setCantidadActual(0);
                }
                    break;
            case 3: if (cafetera.getCantidadActual()>300){
                   cafetera.setCantidadActual(cafetera.getCantidadActual()-300);
               }else{
                   System.out.println("El cafe contiene "+cafetera.getCantidadActual()+"ml devido a que la cafetera se quedo sin cafe");
                   cafetera.setCantidadActual(0);
            }
        }
    }

    public void vaciarCafetera() {
       cafetera.setCantidadActual(0);
    }

    public void agregarCafe() {
        System.out.println("Ingrese una cantidad de cafe a añadir");
        cafetera.setCantidadActual(cafetera.getCantidadActual()+leer.nextInt());
    }
  
    
}
   


  
    

    

    

