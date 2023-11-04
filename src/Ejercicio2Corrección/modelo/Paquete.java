package Ejercicio2Corrección.modelo;

public class Paquete {
    //1. atributos
    private String ipOrigen;
    private String ipDestino;
    private String mensaje;
    private int contador;

    //2. meteodos
    public void incrementarContador(){
        contador++;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "ipOrigen='" + ipOrigen + '\'' +
                ", ipDestino='" + ipDestino + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", contador=" + contador +
                '}';
    }
//3.constructores

    public Paquete() {
    }

    public Paquete(String ipOrigen, String ipDestino, String mensaje, int contador) {
        this.ipOrigen = ipOrigen;
        this.ipDestino = ipDestino;
        this.mensaje = mensaje;
        this.contador = contador;
    }
    // 4.getters y setters


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

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
