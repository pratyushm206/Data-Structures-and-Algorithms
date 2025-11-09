public class InheritanceSingleLevel {
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.color = "Dark blue";
        Shark.habitat = "Water";
        Shark.eat();
        Shark.breathe();
        Shark.fins = 10;
        Shark.swim();
    }

}

class Animal {  //Base class , parent class
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
class Fish extends Animal { // Extend keyword will pass all the properties and methods of Animal class to Fish class
    int fins;

    void swim() {
        System.out.println("Yes! it can swim in water.");
    }
}
