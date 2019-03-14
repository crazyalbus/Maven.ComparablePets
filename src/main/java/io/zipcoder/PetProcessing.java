package io.zipcoder;

import java.util.ArrayList;

public class PetProcessing {

    private static ArrayList<Pet> pets = PetStorage.getPetList();

    private static PetConsole getPets = new PetConsole(System.in, System.out);

    public static void getPetInfo(Integer numberOfPets) {
        for (int i = 0; i < numberOfPets; i++) {
            String petType = getPets.getPetType();
            if(
                    (!petType.equals("Dog")) &&
                            (!petType.equals("Cat")) &&
                            (!petType.equals("Hamster"))
            ) {
                getPets.println("Sorry I don't track that kind of pet");
                i--;
            } else {
                String petName = getPets.getPetName();
                createPet(petType, petName);
            }
        }
    }

    public static void createPet(String petType, String petName) {
        switch (petType) {
            case "Dog":
                Dog dog = new Dog(petName, petType);
                pets.add(dog);
                break;
            case "Cat":
                Cat cat = new Cat(petName, petType);
                pets.add(cat);
                break;
            case "Hamster":
                Hamster hamster = new Hamster(petName, petType);
                pets.add(hamster);
                break;
            default:
                getPets.println("Sorry I don't understand your input");
                break;
        }
    }

}
