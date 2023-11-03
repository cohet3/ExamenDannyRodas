package Ejercicio2.modelo;

public class Servidor {
    //atributos
    private String ip;
    //metodos
    public String [] leerPaquetes (String[] Paquete){
        return  Paquete;
        //recorre el array list apra concatenar los mensajes de cada uno de ellos

    }
    public boolean verificarPaquetes(){
        //devuelve verdadero si la dimension del arrya es igual al contador
        //atributo contador paquetes
        return true;
    }
    //constructores

    public Servidor() {
    }

    public Servidor(String ip) {
        this.ip = ip;
    }
    //getters and setters


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
