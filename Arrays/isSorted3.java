package Arrays;

public class isSorted3 {
    
    public static void main(String[] args){

        int[] arr = {1, 2, 56, 4, 5, 6};


        boolean isSorted = false;

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > arr[i-1]){
                isSorted = true;
            }
            else{
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Sorted");
        }else{
            System.out.println("UnSorted");
        }
    }
}
