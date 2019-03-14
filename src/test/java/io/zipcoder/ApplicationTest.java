package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    @Test
    public void createPetTest() {
        //Given
        String petType = "Cat";
        String petName = "Fitz";

        //When
        PetProcessing.createPet(petType,petName);
        String expected = "Cat - Fitz - meow meow\n";
        String actual = PetStorage.createListToPrint();

        //Then
        Assert.assertEquals(expected,actual);
    }
}
