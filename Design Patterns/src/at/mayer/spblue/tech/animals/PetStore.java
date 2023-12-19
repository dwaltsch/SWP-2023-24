package at.mayer.spblue.tech.animals;

import java.util.ArrayList;
import java.util.List;

public class PetStore {
    public PetStore() {
        this.animalList = new ArrayList<>();
    }

    private List<Animal> animalList;
    public void printNameOfAnimals(){
        for(Animal animal: this.animalList){
            System.out.println(animal.getName());
        }
    }
    public void addAnimal(Animal animal){
        this.animalList.add(animal);
    }
}
