package Ejercicio2Corrección.presentacion;

import Ejercicio2Corrección.modelo.Paquete;
import Ejercicio2Corrección.modelo.Servidor;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PresentacionPaquete {
    public static void main(String[] args) {
        //1. declaración de variables
        String  mensaje;
        String [] paqueteArr;
        Scanner sc= new Scanner(System.in);
        // creación del obejto paquete
        Paquete p1 =new Paquete();
        //solicitar datos
        System.out.println("Escribe una IpOrigen _>");
        p1.setIpOrigen(sc.nextLine());
        System.out.println("Escribe una IpDestino _>");
        p1.setIpDestino(sc.nextLine());
        System.out.println("Escribe una Mensaje _>");
        p1.setMensaje(sc.nextLine());
        System.out.println(p1.toString());
        int longitudMensaje =p1.getMensaje().length();
        int numeroPaquetes= longitudMensaje/20;
        //el contadorPaquetes debe contener la cantidad de partes en las que se ha dividido el mensaje
        p1.setContador(numeroPaquetes);
        System.out.println(numeroPaquetes);
        //guardar los paquetes en un array
        int tamanoDeArray = (int) Math.ceil((double) longitudMensaje / 20);
        String[] arraysDeMensaje = new String[tamanoDeArray];

        int inicio = 0;
        for (int i = 0; i < tamanoDeArray; i++) {
            int fin = inicio + 20;
            if (fin > longitudMensaje) {
                fin = longitudMensaje;
            }
            arraysDeMensaje[i] = p1.getMensaje().substring(inicio, fin);
            inicio = fin;
        }
        for (int i = 0; i< arraysDeMensaje.length; i++){
            System.out.println(arraysDeMensaje[i]);
        }
        //provar servidor
        Servidor s1 = new Servidor();
        s1.leerPaquetes(arraysDeMensaje);
        s1.setIp(p1.getIpOrigen());
        System.out.println("ip Origen ->"+s1.getIp());
        s1.setIp(p1.getIpDestino());
        System.out.println("ip Destino ->"+s1.getIp());
        System.out.println(s1.toString());
        //prueba de verificadorPaquetes;
        System.out.println(s1.verificarPaquetes(arraysDeMensaje.length, p1.getContador()));



//p1 p2 p3 p4 p5 p6 p7 p8 p9 p10 p11 p12 p13 p14 p15 p16 p17 p18 p19 p20 p21

    }
}
