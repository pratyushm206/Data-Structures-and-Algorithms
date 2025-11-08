public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b1 = new Bear();
        b1.grassEaters();
        b1.animalEaters();
    }
}

interface Herbivores {
    void grassEaters();
}

interface Carnivores {
    void animalEaters();
}

class Bear implements Herbivores, Carnivores { //Multiple Inheritance using Interface
    public void grassEaters() {
        System.out.println("They eats green plants and leaves");
    }
    public void animalEaters() {
        System.out.println("They eats other animals");
    }                       
}