package ejercicio4.clases;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        //1. Instanciar un Queue<>() llamado “juegos” con algo llamado LinkedList() para
        //encolar.
        Queue<String> juegos = new LinkedList<String>();

        //2. Deciden agregar los siguientes juegos: Tombo, Congelado, Quemaditas, Cachipún,
        //Pillarse.
        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");
        juegos.add("Pillarse");

        //3. Dada la hora y lo tarde de la videollamada, deciden solamente contar la cantidad de
        //juegos e imprimirlos en pantalla para algún día volver a jugarlos
        System.out.println("Cantidad de juegos: " + juegos.size());

    }
}
