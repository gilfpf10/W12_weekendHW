import MusicShop.MusicShop;
import org.junit.Before;
import org.junit.Test;
import Instruments.Trumpet;

import static junit.framework.TestCase.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        musicShop = new MusicShop("Ryan's");
    }

    @Test
    public void getName() {
        assertEquals("Ryan's", musicShop.getName());

    }
    @Test
    public void countStock(){
        assertEquals(0,musicShop.countStock() );
    }

    @Test
    public void addStock(){
        musicShop.addStock(trumpet);
        assertEquals(1, musicShop.countStock());

    }

}