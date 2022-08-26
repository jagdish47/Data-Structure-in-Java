package Arrays;

public class isSorted2 {

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};


        boolean is = false;
        
        for(int i = 0; i < arr.length-1; i++){
            int j = i+1;
            
            if(arr[i] < arr[j]){
                is = true;
            }
            else{
                is = false;
                break;
            }

        }

        if(is){
            System.out.println("Sorted");
        }else{
            System.out.println("Unsorted");
        }
    }
    
}
