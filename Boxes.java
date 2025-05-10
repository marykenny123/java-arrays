import java.util.Scanner;
public class Boxes {
    public static void main(String[] args) {

        /* ¡Nos mudamos de piso! vamos a crear un pequeño programa que nos ayude a saber en que caja pusimos las siguientes cosas:

        Caja 0. Libros
        Caja 1. Utensilios de cocina
        Caja 2. Artículos de baño
        Caja 3. Bolsos
        Caja 4. Zapatos
        Caja 5. Cosas de verano
        Caja 6. Cosas de invierno
        */

        //Crea un array con las cosas que contienen las cajas
        String[] things = {"libros", "utensilios de cocina", "artículos de baño", "bolsos", "zapatos", "cosas de verano", "cosas de invierno"};

        //Pregunta al usuario lo siguiente: Hola, soy tu asistente de la organización ¿Qué deseas buscar?
        // (la respuesta deberá aparecer en la terminal en la misma línea)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hola, soy tu asistente de la organización ¿Qué desea buscar?\t");
        String reply = scanner.nextLine();
        scanner.close();

        //Crea un programa que te devuelva lo siguiente: <cosas> están en la caja <índice> en el caso de no existir
        //que devuelva: <cosas> no las empacaste, oops!
        int i;
        switch (reply) {
            case ("libros"):
                i = 0;
                System.out.println(reply + " están en la caja " + i);
                break;
            case ("utensilios de cocina"):
                i = 1;
                System.out.println(reply + " están en la caja " + i);
                break;
            case ("artículos de baño"):
                i = 2;
                System.out.println(reply + " están en la caja " + i);
                break;
            case ("bolsos"):
                i = 3;
                System.out.println(reply + " están en la caja " + i);
                break;
            case ("zapatos"):
                i = 4;
                System.out.println(reply + " están en la caja " + i);
                break;
            case ("cosas de verano"):
                i = 5;
                System.out.println(reply + " están en la caja " + i);
                break;
            case ("cosas de invierno"):
                i = 6;
                System.out.println(reply + " están en la caja " + i);
                break;
            default:
                System.out.println(reply + " no las empacaste, oops!");
        }


    }
}
