public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        h1.newColor();

        Hen hen1 = new Hen();
        hen1.eat();
        hen1.walk();
        hen1.newColor();

        Mustang myHorse = new Mustang();
        myHorse.color = "Blue";
    }
}

abstract class AnimalKingdom {
    String color;
    AnimalKingdom() {
        color = "brown";
        System.out.println(color);
        System.out.println("Animal Constructor Called");
    }
    void eat() {
        System.out.println("Eats");
    }
    abstract void walk();
}

class Horse extends AnimalKingdom {
    void newColor() {
        color = "white";
        System.out.println(color);
        
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }
    Horse() {
        System.out.println("Horse constructor called");
    }
}

class Hen extends AnimalKingdom {
    void newColor() {
        color = "yellow";
        System.out.println("Yellow");
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }
    Hen () {
        System.out.println("Hen constructor called");
    }
}

class Mustang extends Horse {
    Mustang () {
        System.out.println("Mustang constructor called");
    }
}