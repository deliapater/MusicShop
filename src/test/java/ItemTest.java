import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ItemTest {

    Item item;


    @Before
    public void setUp() {
        item = new Item("Ukelele", 40, 60);

    }
    @Test
     public void hasName(){
         assertEquals("Ukelele", item.getName());
        }

     @Test
     public void hasBuyingPrice(){
         assertEquals(40, item.getBuyingPrice(), 0.01);
        }

     @Test
     public void hasSellingPrice(){
         assertEquals(60, item.getSellingPrice(), 0.01);
        }

      @Test
      public void canCalculateMarkup(){
         item.calculateMarkup();
         assertEquals(20, item.calculateMarkup(),0.01);
        }


    }

