public class CDPlayer extends Component implements IPlay{

    private int noOfCDs;

    public CDPlayer(String make, String model, int noOfCDs){
        super(make, model);
        this.noOfCDs = noOfCDs;
    }

    public int getNoOfCDs(){
        return noOfCDs;
    }

    public void setNoOfCDs(int number){
        this.noOfCDs = number;
    }


    public String play() {
        return "I am playing " + String.valueOf(getNoOfCDs()) + " CDs";
    }
}
