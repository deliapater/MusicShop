import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    Drumstick drumstick;

    @Before
    public void before(){
        drumstick = new Drumstick("Vic Firth",5, 7, 2);
    }

    @Test
    public void hasBrand(){
        assertEquals("Vic Firth", drumstick.getBrand());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(5, drumstick.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(7, drumstick.getSellingPrice());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(2, drumstick.getSticks());
    }

}
