package staticExample;

public class Main {
    public static void main(String[] args) {
        Human rahul = new Human(22,"Rahul",20000,false);
        Human pankaj = new Human(30,"Pankaj",30000,true);

       // System.out.println(rahul.population);
        System.out.println(Human.population); //static members do not dependent on object.
        System.out.println(Human.population);



        //we cannot access static function inside non-static function but vice-versa we can do that.
    }

    static void fun(){
  //     greeting(); //it will not work because greeting is not static function

        //you cannot access non-static stuff without referencing their instances in a static context.
        //hence here I am referencing it, we can do this like this ->
    Main obj = new Main();
    obj.greeting();
//you cannot access non-static stuff without referencing their instances in a static context.
    }

    //we know that something which is not static, belongs to an object or we can say dependent on object
    void greeting(){

    }
}
