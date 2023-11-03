package Ejercicio2.modelo;

public class Paquete {
    //1. atributos
    private String ipOrigen;
    private String ipDestino;
    private String mensaje;
    private int contadorPaquetes;


    //2. metodos
    public int calcularNumeroPalabras(String mensaje){
        String[] palabras = mensaje.split("\\s+");
        return palabras.length;
    }
    //3. constructores

    public Paquete() {
    }

    public Paquete(String ipOrigen, String ipDestino, String mensaje, int contadorPaquetes) {
        this.ipOrigen = ipOrigen;
        this.ipDestino = ipDestino;
        this.mensaje = mensaje;
        this.contadorPaquetes = contadorPaquetes;
    }
    //4. Getters y setters


    public String getIpOrigen() {
        return ipOrigen;
    }

    public void setIpOrigen(String ipOrigen) {
        this.ipOrigen = ipOrigen;
    }

    public String getIpDestino() {
        return ipDestino;
    }

    public void setIpDestino(String ipDestino) {
        this.ipDestino = ipDestino;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getContadorPaquetes() {
        return contadorPaquetes;
    }

    public void setContadorPaquetes(int contadorPaquetes) {
        this.contadorPaquetes = contadorPaquetes;
    }
}
