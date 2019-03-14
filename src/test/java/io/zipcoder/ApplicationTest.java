package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

public class ApplicationTest {

    @Test
    public void createPetTest() {
        //Given
        String petType = "Cat";
        String petName = "Fitz";

        //When
        PetProcessing.createPet(petType,petName);
        String expected = "Cat - Fitz - meow meow\n";
        String actual = PetStorage.createListToPrint(PetStorage.getPetList());

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sortByNameTest() {
        //Given
        String petType = "Cat";
        String petName = "Fitz";
        Pet testPet = new Cat(petName, petType);
        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(new Cat("Fitz", "Cat"));
        petList.add(new Dog("Albie", "Dog"));
        petList.add(new Hamster("Bubba", "Hamster"));
        petList.add(new Dog("Mimi", "Dog"));
        petList.add(new Cat("Georgie", "Cat"));
        String expected = "" +
                "Dog - Albie - woof woof\n" +
                "Hamster - Bubba - squeek squeek\n" +
                "Cat - Fitz - meow meow\n" +
                "Cat - Georgie - meow meow\n" +
                "Dog - Mimi - woof woof\n";


        //When
        PetStorage.sortByName(petList);
        String sortedList = PetStorage.createListToPrint(petList);

        //Then
        Assert.assertEquals(expected, sortedList);

    }

    @Test
    public void sortByTypeTest() {
        //Given
        String petType = "Cat";
        String petName = "Fitz";
        Pet testPet = new Cat(petName, petType);
        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(new Cat("Fitz", "Cat"));
        petList.add(new Dog("Albie", "Dog"));
        petList.add(new Hamster("Bubba", "Hamster"));
        petList.add(new Dog("Mimi", "Dog"));
        petList.add(new Cat("Georgie", "Cat"));
        String expected = "" +
                "Cat - Fitz - meow meow\n" +
                "Cat - Georgie - meow meow\n" +
                "Dog - Albie - woof woof\n" +
                "Dog - Mimi - woof woof\n" +
                "Hamster - Bubba - squeek squeek\n" ;


        //When
        PetStorage.sortByType(petList, new TypeComparator() );
        String sortedList = PetStorage.createListToPrint(petList);

        //Then
        Assert.assertEquals(expected, sortedList);

    }
}
