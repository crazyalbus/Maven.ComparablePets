package io.zipcoder;

import java.util.ArrayList;

public class PetStorage {

    private static ArrayList<Pet> petList = new ArrayList<Pet>();

    public static void addPet(Pet pet) {
        petList.add(pet);
    }

    public static ArrayList<Pet> getPetList() {
        return petList;
    }

    public static String createListToPrint() {
        String printList = "";
        for (Pet pet : petList) {
            printList = printList + pet.getType() + " - " + pet.getName() + " - " + pet.speak() + "\n";
        }
        return printList;
    }

}
