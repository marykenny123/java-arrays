public class RandomNumbers {
    public static void main(String[] args) {
        
        //Escribe un programa que genere un array de 2 dimensiones de 100 filas y 10 columnas  con números aleatorios del
        // 0 al 99, a través de un bucle anidado (Si no te suenan estos conceptos, ¡búscalos!)
        //System.out.println(randomNumber());
        print2DArray();


        // ------------- arreglar randomnum puesto hasta 9 en lugar de 100 para probar
        // --------------arreglar a 100 filas y 10 columnas, reducido para probar
    }

    /**
     * Function name: randomNumber
     * 
     * @return (int)
     * 
     * Inside the function:
     * 1. generate random numbers from 0 to 99
     */
    public static int randomNumber() {
        int randomNum = (int) (Math.random() * 9);
        return randomNum;
    }


        /**
     * Function name: print2DArray
     * 
     * @param integers (2D array int)
     * 
     * Inside the function:
     * 1. nested loop that prints a 2D array using the randomNumber function
     */
        int rows = 5;
        int columns = 2;
        int[][] twoDArray; //= int[rows][columns];

    public static int[][] print2DArray() {
        int[][] numArray =  new int[5][2];
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 1; j++ ) {
                numArray[i][j] = randomNumber();
                System.out.print(numArray[i][j] + " ");
            }
            System.out.println();
        }


            //System.out.println(numArray);
        return numArray;
        }


    }

