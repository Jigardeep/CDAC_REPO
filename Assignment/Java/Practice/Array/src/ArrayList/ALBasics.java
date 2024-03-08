package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ALBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        //adding elements
        list.add(2);
        list.add(23);
        list.add(34);
        list.add(245);
        list.add(56);
        list.add(654);
        list.add(562);
        list.add(672);
        list.add(34);
        list.add(5);

        list.set(0,99); //updating 0th index
        list.remove(2);


        System.out.println(list);  // printing list
        System.out.println(list.contains(2)); //checking weather the number is available or not

        //input
        for (int i =0; i<5;i++){
            list.add(sc.nextInt());
        }

        //output
        for (int i =0; i<5;i++){
            System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here.
        }

    }
}
