package de.uni_passau.ieee.gradle_ci_demo.animals;

public class Cat implements Animal{

    public Cat() {
    }

    @Override
    public String makeNoise() {
        return "Meow!";
    }
}
