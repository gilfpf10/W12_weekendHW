import Accessories.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class MusicSheetTest {

    MusicSheet musicSheet;

    @Before
    public void setUp() {
    musicSheet = new MusicSheet("musicSheet", 10,20, "Blur");

    }
    @Test
    public void hasType(){
        assertEquals("musicSheet", musicSheet.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(10, musicSheet.getBuyPrice());
    }
    @Test
    public void hasSellPrice(){
        assertEquals(20, musicSheet.getSellPrice());

    }

    @Test
    public void hasSong(){
        assertEquals("Blur", musicSheet.getSong());
    }

}
