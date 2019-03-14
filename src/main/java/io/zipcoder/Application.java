package io.zipcoder;


public class Application {

    private static Integer numberOfPets;

    private static PetConsole getPets = new PetConsole(System.in, System.out);

    public static void main (String[] args) {

        numberOfPets = getPets.getNumberOfPets();

        if (numberOfPets <= 0) {
            getPets.println("Sorry, I can't help you since you have no pets.");
        } else {
            PetProcessing.getPetInfo(numberOfPets);
            getPets.returnPets(PetStorage.createListToPrint(PetStorage.getPetList()));

        }
    }

}
