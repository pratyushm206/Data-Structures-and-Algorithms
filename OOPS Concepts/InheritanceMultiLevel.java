public class InheritanceMultiLevel {
    public static void main(String[] args) {
        Dog pitbull = new Dog();
        pitbull.color = "Black";
        pitbull.habitat = "Land";
        pitbull.eat();
        pitbull.breathe();
        pitbull.legs = 4;
        pitbull.domestic();
        pitbull.breed = "Pitbull";
        pitbull.hot();
    }

}

class Animals {
    String color;
    String habitat; //Land, water, air

    void eat() {
        System.out.println("They eats");
    }
    void breathe() {
        System.out.println("They breathes");
    }
}

class Mammals extends Animals {
    int legs;
    
    void domestic () {
        System.out.println("They are domestic animals");
    }
    void wild () {
        System.out.println("They are wild animals");
    }
}

class Dog extends Mammals {
    String breed;

    void cold() {
        System.out.println("They lives in cold climates");
    }
    void hot() {
        System.out.println("They lives in hot climates");
    }
}
