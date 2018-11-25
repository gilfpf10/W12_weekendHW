import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet("trump", "trumpMaker", "yellow", 1, 150, 300);

    }

    @Test
    public void hasName() {
        assertEquals("trump", trumpet.getName());
    }

    @Test
    public void hasMaker() {
        assertEquals("trumpMaker", trumpet.getMaker());

    }

    @Test
    public void hasColour() {
        assertEquals("yellow", trumpet.getColour());

    }

    @Test
    public void hasValves() {
        assertEquals(1, trumpet.getValves());

    }

    @Test
    public void getSellPrice() {
        assertEquals(300, trumpet.getSellPrice());
    }

    @Test
    public void getBuyPrice(){
        assertEquals(150, trumpet.getBuyPrice());

    }

    @Test
    public void makeSound(){

        assertEquals("trumpet noise", trumpet.play());
    }
}