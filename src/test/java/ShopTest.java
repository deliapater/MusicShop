import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Item item1;
    Item item2;
    Item item3;
    Shop shop;
    @Before
    public void setUp() {
        item1 = new Item("Guitar",80, 100);
        item2 = new Item("Ukelele",60, 80);
        item3 = new Item("Piano",300, 700);
        shop = new Shop();
    }


    @Test
    public void canAddItem(){
        shop.add(item1);
        shop.add(item2);
        shop.add(item3);
        assertEquals(3, shop.countItem());
    }


    @Test
    public void canRemoveItem(){
        shop.add(item1);
        shop.add(item2);
        shop.add(item3);
        shop.remove(item3);
        assertEquals(2, shop.countItem());
    }
}
