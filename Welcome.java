public class Welcome {
    public static void main(String[] args) {

        //Crea un array que contenga 5 nombres de coders y con un bucle 'for-each' imprime: ¡Hola <name>, bienvenida a Java!

        String coders[] = {"Mary", "Mariyah", "Alexandra", "May", "Paula"};
        for (int i = 0; i < coders.length; i++) {
            System.out.println("¡Hola " + coders[i] + ", bienvenida a Java!");
        }

        //Escribe un bucle 'for' que imprima solo los siguientes números: 10 - 30 - 50 - 70 - 90 del array numbers, sin
        // modificarlo ni creando uno nuevo
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int i = 0; i < numbers.length; i+=2) {
            System.out.println(numbers[i]);
        }

        System.out.println("\n");

        //Crea un array que contenga algunos números y usa un bucle 'for-each' e imprime cada número duplicado
        // (multiplicado por 2)
        int[] numArray = {1,5,9,4,80,55};
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]*2);
        }


        //Crea un array de tipo char que contenga las vocales en minúsculas y usa un bucle 'for-each' e imprime cada
        // vocal en mayúsculas

        char[] charArray = {'a','c','t','h','j','z'};
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(Character.toUpperCase(charArray[i]));
        }

    }
}
