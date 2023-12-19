package at.mayer.spblue.tech.animals;

public class Main {
    public static void main(String[] args) {
        PetStore petStore = new PetStore();
        Cat cat = new Cat("Mietzikatzi");
        Dog dog = new Dog("Bello");

        petStore.addAnimal(cat);
        petStore.addAnimal(dog);
        petStore.printNameOfAnimals();
    }
}
