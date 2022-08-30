package String;

import java.util.concurrent.CountDownLatch;

public class BasicOfString {
    
    public static void main(String[] args){

        String str = "Jagdish";

        String anotherStr = new String("Rahul");


        // System.out.println(str.charAt(0));
        // System.out.println(str.charAt(5));


        // for(int i = 0; i < str.length(); i++){
        //     System.out.print(str.charAt(i));
        // }


        // String x = str.substring(2);  //2 to n
        // String y = str.substring(1, 5); //1 to 4 (5th will exclude)

        // System.out.println(x);
        // System.out.println(y);




        // String empty = "";  //Creating empty string
        // String another = empty + "abcdef";  //add to empty string
        // System.out.println(another);





        String a = "abc";
        String b = "xyz";


        System.out.println(a.equals(b));  //We Mostly Use this 
        System.out.println(a == b); //Don't use this because it gives wrong answer most of times



        // Printing a to z
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.println(ch);
        }
    }
}
