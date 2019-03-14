package io.zipcoder;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PetConsole {

    private final Scanner scanner;

    private final PrintStream out;

    public PetConsole(InputStream in, PrintStream out) {
        this.scanner = new Scanner(in);
        this.out = out;
    }

    public void print(String val, Object... args){
        out.format(val, args);
    }

    public void println(String val, Object... vals){
        print(val + "\n", vals);
    }

    public String getStringInput(String prompt, Object...args){
        println(prompt, args);
        return scanner.nextLine();
    }

    public Integer getIntegerInput(String prompt, Object...args) {
        String stringInput = getStringInput(prompt, args);
        return Integer.parseInt(stringInput);
    }

    public Integer getNumberOfPets() {
        String prompt = "How many pets do you have?";
        return getIntegerInput(prompt);
    }

    public String getPetType() {
        String prompt = "Tell me about your pet. Is it a Dog, Cat, or Hamster?";
        return getStringInput(prompt);
    }

    public String getPetName() {
        String prompt = "What is your pet's name?";
        return getStringInput(prompt);
    }

    public void returnPets(String list) {
        println("Here are all your pets:");
        println(list);
        println("Thank you!");
    }
}
