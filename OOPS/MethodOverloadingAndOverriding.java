package OOPS;

public class MethodOverloadingAndOverriding {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1, 2));
        System.out.println(cal.sum((float) 1.1, (float) 2));
        System.out.println(cal.sum(1, 2, 3));

        Deer d = new Deer();
        d.eat();
    }
}

//Method overriding
class Animal {
    void eat() {
        System.out.println("eat anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eat grass");
    }
}

//Method overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
