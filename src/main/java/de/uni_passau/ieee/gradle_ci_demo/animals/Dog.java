package de.uni_passau.ieee.gradle_ci_demo.animals;

public class Dog implements Animal{

    public Dog() {
    }

    @Override
    public String makeNoise() {
        return "Woof!";
    }
}
