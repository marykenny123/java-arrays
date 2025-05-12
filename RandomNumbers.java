import org.w3c.dom.ls.LSOutput;

public class RandomNumbers {
    public static void main(String[] args) {
        
        //Escribe un programa que genere un array de 2 dimensiones de 100 filas y 10 columnas  con números aleatorios
        //del 0 al 99, a través de un bucle anidado (Si no te suenan estos conceptos, ¡búscalos!)

        print2DArray(100,10);
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
        int randomNum = (int) (Math.random() * 100);
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

    public static int[][] print2DArray(int rows, int columns) {
        int[][] numArray =  new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++ ) {
                numArray[i][j] = randomNumber();
                System.out.print(numArray[i][j] + " ");
                }
            System.out.println();
            }
        return numArray;
        }

    }

