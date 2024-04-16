package inheritance;

public class MountainBike extends Bicycle{

    public int seatHeight;

    public MountainBike(int seatHeight, int startSpeed, int startGear){
        super(startSpeed,startGear);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int newValue){
        this.seatHeight = newValue;
    }
}
