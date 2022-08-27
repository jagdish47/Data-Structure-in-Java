package Arrays;

public class segregate {

    public static void main(String[] args) {

    
        int[] arr = {2, -3, 2, -5};

        int i = 0;

        for(int j = 1; j < arr.length; j++){
            if(arr[j] < 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        } 

        for(int a = 0; a < arr.length; a++){
        System.out.print(arr[a] + " ");
        }

    }

}
