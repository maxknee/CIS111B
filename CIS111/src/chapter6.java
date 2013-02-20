import java.util.*
import java.util.Scanner;


/**
 *
 * @author MKnee000
 */
public class chapter6 {

    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        
        int inputNumber;
        System.out.println("Please enter 10 Numbers: ");
        
        inputNumber = input.nextInt();
        numbers[0] = inputNumber;
        
        for (int i = 1; i < numbers.length){
            inputNumber = input.nextInt();
            int repeatNumber = linearSearch(numbers, inputNumber);
            if(repeatNumber < 0){
                numbers[i] = inputNumber;
            }
            System.out.print(numbers[i] + "' ");
            i++;
        }
        
        printArray(numbers);

  }
    /**s
     *
     * @param list 
     * @param key 
     * @return
     */
    public static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i++){
            if (key == list[i]) {
                return i;
            }
            return -1;
        }
       
    }

    /**
     *
     * @param array
     */
    public static void printArray(int array[]){
        System.out.println("Original numbers");
        for (int k = 0; k <array.length; k++){
            System.out.print(array[k] + ", ");
        }
    }
}

