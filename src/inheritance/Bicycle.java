package inheritance;

// define a property as protected when dealing with inheritance for accessing them in subclass;

class Bicycle {

    protected int gear;
    protected int speed;

    public Bicycle(int startGear, int startSpeed){
        gear = startGear;
        speed = startSpeed;
    }

    public void setGear(int newValue){
        gear = newValue;
    }

    public int getSpeed() {
        return speed;
    }
    public int getGear(){
        return gear;
    }

    public void applyBrake(int decrement){
        speed  -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
}
