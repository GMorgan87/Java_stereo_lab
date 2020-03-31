public class RecordDeck extends Component implements IPlay{

    private int playSpeed;

    public RecordDeck(String make, String model, int playSpeed){
        super(make, model);
        this.playSpeed = playSpeed;
    }

    public int getPlaySpeed() {
        return playSpeed;
    }

    public void setPlaySpeed(int playSpeed) {
        this.playSpeed = playSpeed;
    }

    public String play(){
        return "I am playing at " + String.valueOf(getPlaySpeed()) + " rpm";
    }
}