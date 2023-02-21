public class trucks extends vehicle {
    public int numDoors;
    engine mainEngine = new engine();
    body trucksbody =new body();
    wheels numofwheels =new wheels();

    public trucks(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }
}
