public class InheritanceHierarchial {
    public static void main(String[] args) {
        Fishes Whales = new Fishes();
        Whales.color = "Dark blue";
        Whales.habitat = "Water";
        Whales.eat();
        Whales.breathe();
        Whales.fins = 100;
        Whales.swim();
        System.out.println();
        
        Mammal humans = new Mammal();
        humans.color = "mixed";
        humans.habitat = "Land";
        humans.eat();
        humans.breathe();
        humans.walk();
        System.out.println();

        Bird sparrow = new Bird();
        sparrow.color = "Rainbow";
        sparrow.habitat = "Air";
        sparrow.eat();
        sparrow.breathe();
        sparrow.feather();
        sparrow.fly();
        System.out.println();
    }

}

class Creatures {  //Base class , parent class
    String color;
    String habitat;
    void eat() {
        System.out.println("Yes! it eats.");
    }
    void breathe() {
        System.out.println("Yes! it breathes.");
    }
}


// derived or child class

class Fishes extends Creatures { // Extend keyword will pass all the properties and methods of Animal class to Fish class
    int fins;

    void swim() {
        System.out.println("Yes! it can swim in water.");
    }
}

class Bird extends Creatures {
    void fly(){
        System.out.println("They can fly");
    }
    void feather() {
        System.out.println("They have feathers");
    }
}

class Mammal extends Creatures {
    void walk () {
        System.out.println("They can walk.");
    }
}
