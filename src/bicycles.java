public class bicycles extends vehicle {
    public String model;
    engine mainEngine = new engine();
    body bicyclesbody =new body();
    wheels numofwheels =new wheels();

    public bicycles(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
