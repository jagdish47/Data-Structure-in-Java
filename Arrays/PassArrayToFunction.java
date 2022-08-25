package Arrays;

public class PassArrayToFunction {
    public static void main(String[] args){

        int[] arr = {10, 20, 39, 49, 59, 100};

        int a = 10;

        System.out.println(increment(a)); //11
        System.out.println("Before Calling Function : " + a);  //10 it won't change


        // printArray(arr);

    }

    public static int increment(int a){

        a++;
        // System.out.println("Inside Function : " + a);  //11
        return a;

    }
    // public static void printArray(int[] arr){
        
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    // }
}




