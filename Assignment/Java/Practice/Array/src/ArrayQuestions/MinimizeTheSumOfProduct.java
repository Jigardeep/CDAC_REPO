package ArrayQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;



public class MinimizeTheSumOfProduct {

}
class Solution {


    public static long minValue(long a[], long b[], long n)
    {
       // a.sort //{1,1,3}
        Arrays.sort(a);
        Arrays.sort(b);
        //b.sort = {4,5,6}
        long total = 0;

        for (int i =0;i<n;i++){
            total += (a[i] * b[(int)n-i-1]);
        }
        return total;
    }

    public static void main(String[] args) {

        long n = 3;
        long a[] = {3, 1, 1};
        long b[] = {6, 5, 4};

    }
}