package Arrays;

public class PairSum {
    public static void main(String[] args){
        int[] arr = {2, 3, 6, 1, 0};
        int sum = 7;

        System.out.println(findPair(arr, sum));
    }


    public static int findPair(int[] arr, int sum){
        int count = 0;
        for(int i = 0; i < arr.length; i++){

            for(int j = i; j < arr.length; j++){

                if(sum == arr[i] + arr[j]){
                    count++;
                }
            }
        }

        return count;
    }
}
