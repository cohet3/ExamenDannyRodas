package Ejercicio2.presentacion;

import Ejercicio2.modelo.Paquete;

import java.util.Scanner;

public class PaquetePresentación {
    public static void main(String[] args) {
        //1.definición de variables
        Scanner sc= new Scanner(System.in);
        int longitudMensaje;
        String mensaje;
        //definicion de arrays
        String[] palabras= new String[20];
        Paquete p1= new Paquete();
        //solicitar datos
        System.out.println("introduce una ipOrigen -> ");
        p1.setIpOrigen(sc.nextLine());
        System.out.println("introduce una ipDestino -> ");
        p1.setIpDestino(sc.nextLine());
        System.out.println("introduce un mensaje-> ");
        mensaje= sc.nextLine();
        p1.setMensaje(mensaje);

        //averiguar la longitud del mensaje
        longitudMensaje= p1.calcularNumeroPalabras(mensaje);
        System.out.println(longitudMensaje);
        //crear tantas instancias como divisiones se hayan realizado del mensaje
        int numeroPaquetes= longitudMensaje%20/2;
        System.out.println("numero paquetes ->"+numeroPaquetes);
        //el contador paquetes debe tener la cantidad de partes en la que se ha
        //dividido el mensaje
        p1.setContadorPaquetes(numeroPaquetes);
        System.out.println("contador-> "+p1.getContadorPaquetes());
        //guardar los paquetes en un Array
        String [] palabra = mensaje.split("//s+");
        for (int i = 0; i<=palabra.length; i++){

             palabras[i]= palabra[i];

        }
        //mostrar array en consola
        for (String elemento: palabras){
            System.out.println(elemento);
        }



  /*      if(longitudMensaje<=20){
            for (int i= 0; i>20; i++){
            palabras[i]= palabras[i];
            }
            p1.setContadorPaquetes(+1);
        }if(longitudMensaje<20) {
            for (int i = 0; i<20; i++){

            }
            p1.setContadorPaquetes(+2);

        }*/
//        p1 p2 p3 p4 p5 p6 p7 p8 p9 p10 p11 p12 p13 p14 p15 p16 p17 p18 p19 p20 p21


    }
}
