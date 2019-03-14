package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PetStorage {

    private static ArrayList<Pet> petList = new ArrayList<Pet>();

    public static void addPet(Pet pet) {
        petList.add(pet);
    }

    public static ArrayList<Pet> getPetList() {
        return petList;
    }

    public static ArrayList<Pet> sortByName(ArrayList<Pet> petList) {
        Collections.sort(petList);
        return petList;
    }

    public static ArrayList<Pet> sortByType(ArrayList<Pet> petList, Comparator<Pet> comparator) {
        Collections.sort(petList,comparator);
        return petList;
    }

    public static String createListToPrint(ArrayList<Pet> petList) {
        String printList = "";
        for (Pet pet : petList) {
            printList = printList + pet.getType() + " - " + pet.getName() + " - " + pet.speak() + "\n";
        }
        return printList;
    }

}
