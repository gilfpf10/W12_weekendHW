import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import Instruments.Instrument;

import static junit.framework.TestCase.assertEquals;


public class GuitarTest {
    Guitar guitar;

    @Before

    public void setUp() {
        guitar = new Guitar("guitar1", "sony", "blue", 5, 100, 200);


    }


    @Test
    public void hasName() {
        assertEquals("guitar1", guitar.getName());

    }

    @Test
    public void hasCoulor() {
        assertEquals("blue", guitar.getColour());

    }

    @Test
    public void hasMaker() {
        assertEquals("sony", guitar.getMaker());

    }

    @Test
    public void hasStrings() {
        assertEquals(5, guitar.getStrings());

    }

    @Test
    public void hasBuyPrice() {
        assertEquals(100, guitar.getBuyPrice());

    }

    @Test
    public void hasSellPrice() {
        assertEquals(200, guitar.getSellPrice());

    }

    @Test
    public void makeSound() {
        assertEquals("guitar noise", guitar.play());
    }


}