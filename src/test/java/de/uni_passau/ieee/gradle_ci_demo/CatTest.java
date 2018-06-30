import de.uni_passau.ieee.gradle_ci_demo.animals.Cat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {

    private static final String ANIMAL_NOISE = "Meow!";

    private static final Cat cat = new Cat();

    @Test
    public void testMakeNoise() {
        assertEquals("The cat should say \"Meow!\"",
                ANIMAL_NOISE, cat.makeNoise());
    }
}
