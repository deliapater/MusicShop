public class Ukelele extends Instrument implements IPlay {

    private int numberOfStrings;

    public Ukelele(InstrumentType type, String material, String color, int numberOfStrings) {
        super(type, material, color);
        this.numberOfStrings = numberOfStrings;

    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String play(){
        return "bliiing";
    }
}
