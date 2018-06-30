import de.uni_passau.ieee.gradle_ci_demo.animals.Dog;

import org.junit.Test;
import static org.junit.Assert.*;

public class DogTest {

    private static final String ANIMAL_NOISE = "Woof!";

    private static final Dog dog = new Dog();

    @Test
    public void testMakeNoise() {
        assertEquals("The dog should say \"Woof!\"",
                ANIMAL_NOISE, dog.makeNoise());
    }
}
