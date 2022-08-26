package Arrays;

import java.util.Scanner;

public class isSorted1 {
    
    public static void main(String[] args){

        int[] arr = new int[5];

        Scanner inp = new Scanner(System.in);


        for(int i = 0; i < arr.length; i++){

            System.out.println("Index : " + i);
            arr[i] = inp.nextInt();
        }


        boolean isSorted = false;

        for(int j = 0; j < arr.length; j++){

            for(int k = j+1; k < arr.length; k++){

                if(arr[j] > arr[k]){
                    isSorted = false;
                }
                else{
                    isSorted = true;
                }
            }
        }

        if(isSorted){
            System.out.println("Damm! Array is Sorted");
        }
        else{
            System.out.println("Haww! Array is not Sorted0");
        }
    }
}
