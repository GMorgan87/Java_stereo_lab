public class Stereo{

    private String name;
    private Radio radio;
    private RecordDeck recordDeck;
    private CDPlayer cdPlayer;

    public Stereo(String name, Radio radio, RecordDeck recordDeck, CDPlayer cdPlayer) {
        this.name = name;
        this.radio = radio;
        this.recordDeck = recordDeck;
        this.cdPlayer = cdPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void playRadio(){
        radio.play();

    }  public void playCD(){
        cdPlayer.play();

    }  public void playRecord(){
        recordDeck.play();
    }

    public int getRecordDeckPlaySpeed() {
        return recordDeck.getPlaySpeed();
    }

    public int getCDPlayerNoOfCDs() {
        return cdPlayer.getNoOfCDs();
    }


}
