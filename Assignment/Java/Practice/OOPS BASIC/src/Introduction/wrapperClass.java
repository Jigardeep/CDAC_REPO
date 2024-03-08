package Introduction;

public class wrapperClass {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        swap(a,b);
        System.out.println("a = " + a + ", b = " + b);

        final A rahul = new A("rahul");
        rahul.name = "Rahul yadav";

        //when a non primitive is final, you cannot reassign it.
        //rahul = new A("kunal");
    }

    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class A{
    String name;

    public A(String name) { //constructor
        this.name = name;
    }
}

//finialize keyword
