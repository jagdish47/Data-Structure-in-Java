package Arrays;

public class FindUniqueElement {

    public static void main(String[] args){

        int[] arr = {3, 2, 3, 2, 5, 1, 5};

        for(int i = 0; i < arr.length; i++){
            int count = 0;

            for(int j = 0; j < arr.length; j++){
                

                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(arr[i]);
            }
        }
    }
    
}
