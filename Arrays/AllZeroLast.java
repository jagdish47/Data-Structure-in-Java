package Arrays;

public class AllZeroLast {
    
    public static void main(String[] args){

    int[] arr = {1, 0, 5, 0, 3};

    int i = 0;

    for(int j = 0; j < arr.length; j++){

        if(arr[j] >  0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
        }
    }


    for(int a = 0; a < arr.length; a++){
        System.out.print(arr[i] + " ");
    }

}
}
