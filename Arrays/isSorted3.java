package Arrays;

public class isSorted3 {
    
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5, 6};

        boolean ans = isSorted(arr);
        System.out.println(ans);

        
    }

    public static boolean isSorted(int[] arr){

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
