public class MethodOverriding {
    
    public static void main(String[] args) {
        Calculator calcy = new Calculator();
        System.out.println(calcy.sum(12, 45));
        System.out.println(calcy.sum(12, 15, 20));
        System.out.println(calcy.sum((float)35.765, (float)23.984));

        Deer deer = new Deer();
        deer.eat();

    }
}
    
class WildAnimal {
    void eat () {
        System.out.println("Eats anything");
    }
}

class Deer {
    void eat () {
        System.out.println("Eats grass");
    }
}


class Calculator {
    int sum (int a, int b) {
        return a+b;
    }
    float sum (float a , float b) {
        return a+b;
    }
    int sum (int a , int b , int c) {
        return a+b+c;
    }
}

