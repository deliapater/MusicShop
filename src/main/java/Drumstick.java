public class Drumstick extends Accessory implements ISell {

    private int sticks;


    public Drumstick(String brand, int buyingPrice, int sellingPrice, int sticks) {
        super(brand, buyingPrice, sellingPrice);
        this.sticks = sticks;
    }

    public int getSticks() {
        return sticks;
    }

    public void setSticks(int sticks) {
        this.sticks = sticks;
    }

    public double calculateMarkup(){
        return  this.getBuyingPrice() - this.getSellingPrice();
    }


    }

