package Arrays;

public class PariSumOptimized {
    
    public static void main(String[] args){

        int[] arr = {2, 3, 4, 2, 4, 5, 1};
        int sum = 7;

        bubbleSort(arr);

        System.out.println(pairSum(arr, sum));


    }

    public static int pairSum(int[] arr, int sum){

        int end = arr.length - 1;
        int start = 0;
        int count = 0;

        while(start < end){
            if(arr[start] + arr[end] < sum){
                start++;
            }
            else if(arr[start] + arr[end] > sum){
                end--;
            }
            else{
                count++;
                start++;
                end--;
            }
        }

        return count;
 }


    public static void bubbleSort(int arr[]){

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr.length-1-i; j++){

                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void swap(int arr[], int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
