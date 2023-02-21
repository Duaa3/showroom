public class motorcycles extends vehicle{
    public String model;
    engine mainEngine = new engine();
    body motorcyclesbody = new body();
    wheels numofwheels =new wheels();

    public motorcycles(String brand, String model) {
        super(brand);
        this.model = model;
    }
}
