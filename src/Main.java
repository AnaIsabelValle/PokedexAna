import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" --------------**OOOO** --------------");
        System.out.println("Querido usuario, le damos la bienvenida a nuestro menú Pokedex: ");

        String opcion = "";
        boolean salida = false;


        while (salida != true) {
            System.out.println("a. Añadir un pokemon");
            System.out.println("b. Añadir avistamiento legendario");
            System.out.println("c. Pasar a capturados");
            System.out.println("d. Mostrar listas de avistados");
            System.out.println("e. Mostrar lista de capturados");
            System.out.println("f. Cerrar la pokedex");

            opcion = teclado.nextLine();

            switch (opcion) {
                case "a":


                    break;

        /*
        Pokemon anapokemon = new Pokemon("Bulbasur",
                "seed", 2.04f, 15.01f,"A strange");*/

            }

        }
    }
}