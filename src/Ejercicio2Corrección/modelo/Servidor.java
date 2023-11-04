package Ejercicio2Corrección.modelo;

public class Servidor {
    //1. atributos
    private String ip;
    //2. metodos
    public boolean verificarPaquetes( int dimensionArr, int contadorPaquetes) {
        return dimensionArr == contadorPaquetes;
    }

    @Override
    public String toString() {
        return "Servidor{" +
                "ip='" + ip + '\'' +
                '}';
    }

    public String leerPaquetes(String [] paquetes){
        StringBuilder mensajeConcatenado = new StringBuilder();
        for (String paquete : paquetes) {
            mensajeConcatenado.append(paquetes.toString());
        }

        return mensajeConcatenado.toString();
    }

    //3.constructores

    public Servidor() {
    }

    public Servidor(String ip) {
        this.ip = ip;
    }
    //4.getters y setters

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
