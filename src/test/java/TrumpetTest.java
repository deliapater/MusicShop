import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setup(){
        trumpet = new Trumpet(InstrumentType.Wind, "Brass", "Gold", 4);
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.Wind, trumpet.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals("Gold", trumpet.getColor());
    }

    @Test
    public void hasNumberOfValves(){
        assertEquals(4, trumpet.getNumberOfValves()
        );
    }

    @Test
    public void canPlay(){
        trumpet.play();
        assertEquals("Ra, ra, ra, ra", trumpet.play());
    }
}


