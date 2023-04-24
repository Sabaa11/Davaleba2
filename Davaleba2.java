enum AnimalType {
    MAMMAL,
    BIRD,
    REPTILE,
    AMPHIBIAN,
    FISH
}

abstract class Animal {
    protected String name;
    protected int age;
    protected AnimalType type;
    protected String habitat;

    public Animal(String name, int age, AnimalType type, String habitat) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.habitat = habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract void receiveTreatment();
}

class Dog extends Animal implements Pet {
    private String breed;

    public Dog(String name, int age, AnimalType type, String habitat, String breed) {
        super(name, age, type, habitat);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void playWith() {
        System.out.println("Playing fetch with " + this.name);
    }

    @Override
    public void receiveTreatment() {
        System.out.println(this.name + " is receiving medical treatment");
    }
}

class Parrot extends Animal implements Pet, Bird {
    private String color;

    public Parrot(String name, int age, AnimalType type, String habitat, String color) {
        super(name, age, type, habitat);
        this.color = color;
    }

    public void mimicSound() {
        System.out.println(this.name + " is mimicking sounds");
    }

    @Override
    public void playWith() {
        System.out.println("Playing with " + this.name + " by talking to it");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " is flying in circles");
    }

    @Override
    public void receiveTreatment() {
        System.out.println(this.name + " is receiving medical treatment");
    }
}

interface Pet {
    void playWith();
}

interface Bird {
    void fly();
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex", 3, AnimalType.MAMMAL, "Home", "Labrador");
        myDog.bark(); 
        myDog.playWith(); 
        myDog.receiveTreatment(); 

        Parrot myParrot = new Parrot("Polly", 5, AnimalType.BIRD, "Jungle", "Green");
        myParrot.mimicSound(); 
        myParrot.playWith(); 
        myParrot.fly(); 
        myParrot.receiveTreatment(); 
    }
}
