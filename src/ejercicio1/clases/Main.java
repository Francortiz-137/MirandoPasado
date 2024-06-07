package ejercicio1.clases;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    //1. Instanciar un ArrayList<>() del tipo String llamado “marcas” para generar un listado
    //de marcas.
    private static ArrayList<String> marcas = new ArrayList<>();

    public static void main(String[] args) {
        //2. Agregar 10 marcas que usted haya conocido e imprimirlas en consola mediante
        //System.out.println.
        marcas.addAll(Arrays.asList("Samsung", "Apple", "Sony", "LG", "Dell", "HP", "Lenovo", "Asus", "Panasonic", "Philips"));
        marcas.forEach(System.out::println);

        //3. Su amiga le dice que recordó 3 marcas y le pregunta si puede agregarlas al listado.
        //Los elementos a agregar son “Blokbaster”, “Carrefour” y “Jetix”. Imprimir el nuevo
        //listado en consola.

        marcas.add("Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");
        System.out.println("Lista actualizada: ");
        marcas.forEach(System.out::println);

        //4. Se dan cuenta que “Blokbaster” en realidad se escribe “Blockbuster” y deciden cambiar
        //la palabra en el listado.
        marcas.set(marcas.indexOf("Blokbaster"), "Blockbuster");

        //5. Lamentablemente, usted se da cuenta que “Carrefour” aún existe y decide borrarlo del
        //listado. Para ello, usted debe remover el elemento número 11 e imprimir el nuevo
        //listado en pantalla. Puede usar la función .remove("Carrefour") para ver si el
        //elemento se borró correctamente, ya que arrojará true si se eliminó de manera
        //correcta.
        marcas.remove("Carrefour");
        marcas.forEach(System.out::println);

        //6. Usted se inspira y decide hacer una colección aparte de marcas que podrían estar
        //fuera del mercado. Para ello, usted debe agregar marcas (las que quiera) en una nueva
        //ArrayList<>() llamada “posiblesMarcas” e incorporarlas a la lista de ”marcas”.

        ArrayList<String> posiblesMarcas = new ArrayList<>(Arrays.asList("Nokia", "Kodak", "BlackBerry", "Compaq", "Toshiba"));
        marcas.addAll(posiblesMarcas);
        marcas.forEach(System.out::println);

        //7. A eso de las 11 de la noche, deciden ver cuántos elementos tiene este listado. Es por
        //eso que usted utiliza sus conocimientos y cuenta la cantidad de elementos que
        //contiene la lista para imprimir en pantalla.
        System.out.println("Largo de la lista: " + marcas.size());
    }
}
