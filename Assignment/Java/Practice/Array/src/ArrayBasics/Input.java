package ArrayBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 33;
        arr[2] = 43;
        arr[3] = 53;
        arr[4] = 63;
        //System.out.println(arr[2]);

        //input using for loop
      //  for (int i= 0; i< arr.length; i++){ //taking values from a user
      //      arr[i] = sc.nextInt(); }

        //1st way to print -> normal for loop
       // for (int i= 0; i< arr.length; i++){ //printing array
       //     System.out.print(arr[i] + " ");        }

        //2nd way to print -> for-each loop
       // for (int num : arr) { //for every element in array, print the element
       //     System.out.print(num + " "); }// here num represents element of the array


        //3rd way to print -> toString() method
       // System.out.println(Arrays.toString(arr));


        //array of objects
        String[] str = new String[4];

        for (int i = 0; i< str.length; i++){ //for taking inputs from a user
            str[i] = sc.next();
        }

        //modifying
        str[1] = "rahul";
        System.out.println(Arrays.toString(str)); //for printing


    }
}
