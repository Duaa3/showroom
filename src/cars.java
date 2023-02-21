public class cars extends vehicle{
    public int numDoors;

    public cars(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}
