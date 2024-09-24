class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Pet extends Dog {
    void play() {
        System.out.println("Pet plays");
    }
}

class FarmAnimal extends Animal {
    void produce() {
        System.out.println("Farm animal produces");
    }
}

class Cow extends FarmAnimal {
    void milk() {
        System.out.println("Cow produces milk");
    }
}

class HybridAnimal extends Dog { // Hybrid inheritance: combining multiple and hierarchical
    void fly() {
        System.out.println("Hybrid animal can fly");
    }
}

public class InheritanceTypes {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Single inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Multilevel inheritance -
        Pet pet = new Pet();
        pet.eat();
        pet.bark();
        pet.play();

        // Hierarchical inheritance
        Cat cat = new Cat();
        Cow cow = new Cow();
        cat.eat();
        cat.meow();
        cow.eat();
        cow.produce();
        cow.milk();

    }
}



// THERE IS A PROBLEM IN INHERITANCE THAT WE ARE GOING TO DISCUSS IN THE INHERITANCE-II FILE : 
// it is regarding 'V' type INHERITANCE i.e can a child class have 2 parents  