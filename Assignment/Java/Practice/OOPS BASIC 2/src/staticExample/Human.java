package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; //when a member is declared is static it can be accessed before any of the object of the class have been created and without referencing to that object.

    static void message(){
        System.out.println("hello world");
        //System.out.println(this.age); //we cannot use this keyword inside static method.
    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}

