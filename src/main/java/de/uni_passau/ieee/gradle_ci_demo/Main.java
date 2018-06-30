package de.uni_passau.ieee.gradle_ci_demo;

import de.uni_passau.ieee.gradle_ci_demo.animals.Animal;
import de.uni_passau.ieee.gradle_ci_demo.animals.Cat;
import de.uni_passau.ieee.gradle_ci_demo.animals.Dog;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("The dog says: " + dog.makeNoise());
        System.out.println("The cat says: " + cat.makeNoise());
    }
}
