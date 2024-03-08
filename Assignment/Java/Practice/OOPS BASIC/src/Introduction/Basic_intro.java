package Introduction;

public class Basic_intro {
    public static void main(String[] args) {

        //array of 5 rollNumbers
        int[] rollNumber = new int[5];

        //store 5 names
        String[] names = new String[5];

        float[] marks = new float[5];

        Student[] students = new Student[5];

        // Student students => compile time, new Student() => run time
        //new does dynamic memory allocation
        Student student1 = new Student(); //initilaize
       // student1.rollNumber = 12;
       // student1.marks = 96f;
       // student1.name = "Rahul jain";

        System.out.println(student1.name);
        System.out.println(student1.marks);
        System.out.println(student1.rollNumber);

       student1.greeting();
       //student1.changeName("Ashutosh Yadav");

        Student student2 = new Student();
        System.out.println(student2.name);
        System.out.println(student2.rollNumber);


    }
}
class Student {
    int rollNumber;
    String name;
    float marks;

    void greeting(){
        System.out.println("My name is " + this.name);
    }

    void changeName (String newName){
        name = newName;
        System.out.println("The name is changed and the new name is "+newName);
    }

    //calling constructor using constructor
    Student (Student otherStudent){
        this.name = otherStudent.name;
        this.marks = otherStudent.marks;
        this.rollNumber = otherStudent.rollNumber;
    }
    Student(){
        this.rollNumber = 2;
        this.name = "Rahul yadav";
        this.marks = 97.5f;
    }

    //Student arpit = new Student(17,"Arpit",87.4f)
    //here, this will be replaced with arpit
    Student(int rollNumber, String name, float marks){
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

   // Student(){
        //this is how you call constructor from another  constructor
        //internally it is like : new Student(13,"default person" , 100f)
    //    this(13,"default person" , 100f);
    //}


        }
