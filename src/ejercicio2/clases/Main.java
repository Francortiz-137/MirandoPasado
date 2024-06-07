package ejercicio2.clases;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    //1. Instanciar un Set<>() del tipo String llamado “invitados” para generar un listado de
    //compañeros/as. Usted le comenta a su amiga que pueden usar algo llamado
    //TreeSet<>() para listarlos ordenadamente.
    private static Set<String> invitados = new TreeSet<>();

    public static void main(String[] args) {
        //2. Luego de muchos recuerdos, deciden agregar los siguientes nombres: “Daniel”,
        //“Paola”, “Facundo”, “Pedro”, ”Jacinta”, “Florencia” y “Juan Pablo”.
        invitados.addAll(Arrays.asList("Daniel", "Paola", "Facundo", "Pedro", "Jacinta", "Florencia", "Juan Pablo"));

        //3. Su amiga le dice que se acaba de acordar de 3 ex compañeros adicionales y le
        //pregunta si puede agregarlos en un listado aparte de “posibles invitados”, ya que no
        //les caía muy bien. Los “posibles invitados” son “Jorge”, “Francisco” y “Marcos”. Genere
        //este nuevo listado, únalo con el otro e imprima en pantalla.
        Set<String> posiblesInvitados = new TreeSet<>();
        posiblesInvitados.add("Jorge");
        posiblesInvitados.add("Francisco");
        posiblesInvitados.add("Marcos");

        invitados.addAll(posiblesInvitados);
        invitados.forEach(System.out::println);

        //4. Lamentablemente, usted se da cuenta que es mejor no invitar a “Jorge” y decide
        //eliminarlo del listado. Imprima el listado final de invitados para que comiencen a
        //contactarlos lo antes posible.

        invitados.remove("Jorge");
    }
}
