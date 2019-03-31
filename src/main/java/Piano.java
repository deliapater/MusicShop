public class Piano extends Instrument implements IPlay {

    private int numberOfKeys;
    private int numberOfPedals;

    public Piano(InstrumentType type, String material, String color, int numberOfKeys, int numberOfPedals) {
        super(type, material, color);
        this.numberOfKeys = numberOfKeys;
        this.numberOfPedals = numberOfPedals;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public int getNumberOfPedals() {

        return numberOfPedals;
    }

    public void setNumberOfPedals(int numberOfPedals) {
        this.numberOfPedals = numberOfPedals;
    }

    public String play(){
        return "Plink";
    }
}
