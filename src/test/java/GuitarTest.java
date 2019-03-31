import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setup(){
        guitar = new Guitar(InstrumentType.String, "Wood", "Brown", 6);
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.String, guitar.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals("Brown", guitar.getColor());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfString()
        );
    }

    @Test
    public void canPlay(){
        guitar.play();
        assertEquals("dling", guitar.play());
    }
}
