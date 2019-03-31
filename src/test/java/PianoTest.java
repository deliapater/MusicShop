import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PianoTest {

        Piano piano;

        @Before
        public void setup(){
            piano = new Piano(InstrumentType.Keyboard, "Wood", "Black", 88, 3);
        }

        @Test
        public void hasType(){
            assertEquals(InstrumentType.Keyboard, piano.getType());
        }

        @Test
        public void hasMaterial(){
            assertEquals("Wood", piano.getMaterial());
        }

        @Test
        public void hasColor(){
            assertEquals("Black", piano.getColor());
        }

        @Test
        public void hasNumberOfStrings(){
            assertEquals(88, piano.getNumberOfKeys()
            );
        }


        @Test
    public void hasNumberOfPedals(){
            assertEquals(3, piano.getNumberOfPedals());
        }

        @Test
    public void hasNumberOfKeys(){
            assertEquals(88, piano.getNumberOfKeys());
        }

        @Test
        public void canPlay(){
            piano.play();
            assertEquals("Plink", piano.play());
        }
    }


