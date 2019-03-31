public class Guitar extends Instrument implements IPlay {

    private int numberOfString;
    public Guitar(InstrumentType type, String material, String color, int numberOfString) {
        super(type, material, color);
        this.numberOfString = numberOfString;
    }

    public int getNumberOfString() {
        return numberOfString;
    }

    public String play(){
        return "dling";
    }
}
