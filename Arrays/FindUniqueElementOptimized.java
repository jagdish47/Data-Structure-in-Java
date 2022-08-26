package Arrays;

public class FindUniqueElementOptimized {
  public static void main(String[] args){
    int[] arr = {2, 3, 2, 4, 3, 4, 1};


    int x = 0;

    for(int i = 0; i < arr.length; i++){
        x = x^arr[i];
    }

    System.out.println(x);
  }

    
}
