package Arrays;

public class Fibonacci {

    public static void main(String[] args){

        int[] arr = new int[10];

        arr[0] = 0;
        arr[1] = 1;

        // int tracker = 2;
        for(int i = 2; i < arr.length; i++){

            arr[i] = arr[i-1] + arr[i-2];
        }

        // for(int i = 0; i < arr.length; i++){ //Print whole Fibonacci series
        //     System.out.print(arr[i] + " ");
        // }

        System.out.println(arr[arr.length - 1]);  //only give the last element
    }
    
}
