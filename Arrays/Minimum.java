package Arrays;

public class Minimum {
    
    public static void main(String[] args){

        int[] arr = {34, 454, 232, 24353, 4565,546 ,43 ,7};


        int minimum = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }


        System.out.println("The minimu element in Array is : " + minimum);
    }
}
