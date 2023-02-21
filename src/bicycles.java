public class bicycles extends vehicle {
    public String model;

    public bicycles(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
