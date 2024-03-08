package ArrayBasics;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
       int[] nums = new int[5];

       change(nums);

       System.out.println(Arrays.toString(nums));
    }
     static void change(int[] array){
        array[2] = 99;
    }
}
