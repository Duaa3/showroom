public class cars extends vehicle{
    public int numDoors;
    engine mainEngine = new engine();
    body carsbody = new body();
    wheels numofwheels =new wheels();

    public cars(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}
