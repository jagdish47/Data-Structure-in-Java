package Arrays;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args){

        // int[] arr = new int[7];

        int[] arr = {10, 39, 4, 5, 66, 7, 1000};


        // Scanner inp = new Scanner(System.in);

        // for(int i = 0; i < arr.length; i++){
        //     System.out.print("Element at Index-" + i + " = ");
        //     arr[i] = inp.nextInt();
        // }

        int maximum = 0;

        for(int j = 0; j < arr.length; j++){

            if(arr[j] > maximum){
                maximum = arr[j];
            }
        }

        System.out.println("The Maximum Element in Array is : " + maximum);

    }
}
