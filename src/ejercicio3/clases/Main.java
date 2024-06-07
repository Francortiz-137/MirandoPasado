package ejercicio3.clases;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    //1. Instanciar un Map<>() del tipo <String, Integer> llamado “golosinas” para generar un
    //listado de estas. Usted le comenta a su amiga que le gustaría probar algo llamado
    //TreeMap() para listarlos por claves.
    private static Map<String,Integer> golosinas = new TreeMap<String,Integer>();
    public static void main(String[] args) {

        //2. Deciden agregar las siguientes golosinas:
        //● Chocman a 100 pesos
        //● Trululú a 100 pesos
        //● Centella a 100 pesos
        //● Kilate a 50 pesos
        //● Miti-miti a 30 pesos
        //● Traga Traga a 150 pesos
        //● Tabletón a 5 pesos
        golosinas.put("Chocman", 100);
        golosinas.put("Trululú", 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-miti", 30);
        golosinas.put("Traga Traga", 150);
        golosinas.put("Tabletón", 5);

        //3. Su amiga le dice que si es posible filtrar aquellas golosinas que costaban menos de
        //100 pesos para mostrar en sus redes sociales el valor del dinero en el tiempo.

        golosinas.forEach((nombre, precio) -> {
            if (precio < 100) {
                System.out.println(nombre + " a " + precio + " pesos");
            }
        });
    }
}
