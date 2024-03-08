package MultidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 /*       int[][] arr = {
                {1, 2, 3}, //0th index
                {4, 5},    // 1st index
                {6, 7, 8, 9}, // 2nd index
        };

  */
        int[][] arr = new int[3][2];

        //input
        for (int row =0; row<arr.length; row++){
            for (int col =0 ; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //output - 1st way
 /*       for (int row =0; row<arr.length; row++){
            for (int col =0 ; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

  */

        //output - 2nd way
   /*     for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

    */

        //output - enhance for loop
        for (int[] element : arr) {
            System.out.println(Arrays.toString(element));
        }

    }
    }

