public class Trumpet extends Instrument implements IPlay {

    private int numberOfValves;

    public Trumpet(InstrumentType type, String material, String color, int numberOfValves) {
        super(type, material, color);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }

    public String play(){
        return "Ra, ra, ra, ra";
    }
}
