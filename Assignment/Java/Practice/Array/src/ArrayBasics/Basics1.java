package ArrayBasics;

public class Basics1 {

    public static void main(String[] args) {
        //syntax
        //dataType[] variableName = new dataType[size];
        //primitive data type are stored in stack memory
        //array, string, hashmap etc are stored in heap memory.

        int[] rollNo = new int[5];
        //int[] rollNo -> declaration of array. rollNo is getting defined in the stack (compile time)
        //rollNo = new int[5] -> (initialisation) actually here object is being created in the memory(heap memory) (run time)
        //new keyword -> it basically used to create an object.
        //this is known as dynamic memory allocation because memory is allocated at run time.
        int[] rollNo2 = {1,2,3,4,5,6};

        String[] arr = new String[5]; //string array
        System.out.println(arr[1]); //output -> null


    }
}

//Points to remember
//1. array object are in heap.
//2. heap object are not continuous.
//3. dynamic memory allocation.
//hence -> In java internally memory may not be continuous because it depends on jvm.
