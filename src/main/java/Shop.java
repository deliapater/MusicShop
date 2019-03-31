import java.util.ArrayList;

public class Shop{

    Item item;
    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();

    }

    public ArrayList<ISell> getStock() {
        return stock;
    }


    public int countItem(){
        return this.stock.size();
    }


    public double calculateMarkup() {
        return 0;
    }


    public void add(ISell inventory){
        this.stock.add(inventory);

    }

    public void remove(ISell inventory){
        this.stock.remove(inventory);
    }
}


