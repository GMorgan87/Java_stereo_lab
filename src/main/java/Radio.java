public class Radio extends Component implements IPlay{

    private String tune;

    public Radio(String make, String model, String tune){
        super(make, model);
        this.tune = tune;
    }

    public String getTune() {
        return tune;
    }

    public void setTune(String tune) {
        this.tune = tune;
    }

    public String play() {
        return "I am playing" + getTune();
    }
}
