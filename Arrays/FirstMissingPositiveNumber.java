package Arrays;


public class FirstMissingPositiveNumber {

    public static void main(String[] args){

        int[] arr = {-2, 3, 1, -6, 7, 4, 5};

        int start = segregate(arr);

        int[] newarr = new int[arr.length - start+1];

        int k = 0;

        for(int i = start; i < arr.length; i++){
            newarr[k] = arr[i];
            k++;
        }

        for(int a = 0; a < newarr.length; a++){
            int x = Math.abs(a);

            if(x-1 < newarr.length && newarr[x-1] > 0){
                newarr[x-1] = newarr[x-1];
            }
        }

        for(int i = 0; i < newarr.length; i++){

            if(newarr[i] > 0){
                System.out.println(i+1);
            }
        }




    }

    public static int segregate(int[] arr){
         
        int i = 0;

        for(int j = 0; j < arr.length; j++){
            if(arr[j] < 0){
                swap(arr[i], arr[j]);
                i++;
            }
        }

        return i;
    }

    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
    
}
