package OOPS;

public class Abstraction {
    public static void main(String[] args) {
       Mustang myHorse=new Mustang();
        //Animal -> Horse -> Mustang
    }
}

//abstraction class
abstract class Animal{
    String color;
      
    //constructor
    Animal(){
        System.out.println("Animal constructor called");
    }

    void eat(){
        System.out.println("animal Eats");
    }

    //abstraction method/function
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
void changeColor(){
    color="dark brown";
}
void walk(){
System.out.println("walk on 4 legs");
}
}

class Mustang extends Horse{
Mustang(){
    System.out.println("Mustang constructor called");
}
}



