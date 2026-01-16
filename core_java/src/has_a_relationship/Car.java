package has_a_relationship;

public class Car {

    private int id;
    private String brand;
    private String model;
    private String color;
    private double topSpeed;

    private Engine engine;   // HAS-A relationship

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void showBeast() {
        System.out.println("👑🔥 KING OF BEASTS 🔥👑");
        System.out.println("Brand        : " + brand);
        System.out.println("Model        : " + model);
        System.out.println("Color        : " + color);
        System.out.println("Top Speed    : " + topSpeed + " km/h");
        System.out.println("Engine       : " + engine.getCc() + " cc");
        System.out.println("Config       : " + engine.getConfiguration());
        System.out.println("Aspiration   : " + engine.getAspiration());
    }

    public static void main(String[] args) {

        Engine monster = new Engine();
        monster.setCc(8000);                          // 8.0L 😈
        monster.setConfiguration("W16");
        monster.setAspiration("Quad Turbo");

        Car bugatti = new Car();
        bugatti.setId(1);
        bugatti.setBrand("Bugatti");
        bugatti.setModel("Chiron Super Sport");
        bugatti.setColor("Carbon Black");
        bugatti.setTopSpeed(490);                   
        bugatti.setEngine(monster);                   

        bugatti.showBeast();
    }
}
