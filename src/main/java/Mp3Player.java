public class Mp3Player extends Component implements IPlay, IConnect {


    public Mp3Player(String make, String model) {
        super(make, model);
    }

    public String play() {
        return null;
    }

    public String connect(Stereo stereo) {
        return "I am connected to " + stereo.getName();
    }
}
