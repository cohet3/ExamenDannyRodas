public class Ejercicio1 {
    public static void main(String[] args) {
        //1. Realizar el codigo necesario para mostrar por consola las direcciones de los hots(nodos)de una red
        //clase C con dirección 192.168.2 Recordando que la máscara de red es 255.255.255.0
        //1. Declaración de variables

            String identificadorRed = "192.168.2.";
            for(int i = 1; i<=255; i++) {
                System.out.println(identificadorRed + i);
            }

    }
}
