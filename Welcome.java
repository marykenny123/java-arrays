public class Welcome {
    public static void main(String[] args) {
// ------------- falta arreglar penúltiimo (error) y último (debe ser for each) + subir en branch develop
        //Crea un array que contenga 5 nombres de coders y con un bucle 'for-each' imprime: ¡Hola <name>, bienvenida a Java!

        String coders[] = {"Mary", "Mariyah", "Alexandra", "May", "Paula"};
        for (int i = 0; i < coders.length; i++) {
            System.out.println("¡Hola " + coders[i] + ", bienvenida a Java!");
        }

        System.out.print("\n");

        //Escribe un bucle 'for' que imprima solo los siguientes números: 10 - 30 - 50 - 70 - 90 del array numbers, sin
        // modificarlo ni creando uno nuevo
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int i = 0; i < numbers.length; i+=2) {
            System.out.println(numbers[i]);
        }

        System.out.print("\n");

        //Crea un array que contenga algunos números y usa un bucle 'for-each' e imprime cada número duplicado
        // (multiplicado por 2)
        int[] numArray = {1,5,9,4,80,55};
        for (int i: numArray) {
            //int newNumber = (numArray[i]*2);
            System.out.println(i*2);
        }

        System.out.print("\n");

        //Crea un array de tipo char que contenga las vocales en minúsculas y usa un bucle 'for-each' e imprime cada
        // vocal en mayúsculas

        char[] charArray = {'a','c','t','h','j','z'};
        for (char i : charArray) {
            System.out.println(Character.toUpperCase(i));
        }

    }
}
