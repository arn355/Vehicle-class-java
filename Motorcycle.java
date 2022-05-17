public class Motorcycle extends Engine implements Process {
    static int numberOfMotorcycle;
    private String brand;
    private double price;

    public Motorcycle() {
        numberOfMotorcycle++;
    }

    public Motorcycle(int max_speed, int accel, String brand, double price) {
        super(max_speed, accel);
        numberOfMotorcycle++;
        this.brand = brand;
        this.price = price;
    }

    public static int getNumberOfMotorcycle() {
        return numberOfMotorcycle;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displaySumOfMeter() {
        System.out.println("Sum of meter : " + (getSumOfkm() * 1000) + " meters");
    }
    
    @Override
    public void drive(double time) {
        if (getAccel() >= getMax_speed() && getAccel() <= 0) {
            System.out.println("OVER LIMIT SPEEED!!");
        } else {
            double s = getAccel() * time;
            setSumOfkm(getSumOfkm() + s);
            setAgeHr(getAgeHr() + time);
            System.out.println("O>^<O -------< YOU HAVE RIDE FOR " + getSumOfkm() + " kilometers");
        }
    }

    @Override
    public void accelerate(double increaseAccel) {
        setAccel(getAccel() * increaseAccel);
    }

    @Override
    public void status() {
        super.status();
        System.out.println("Name : " + this.brand);
        System.out.println("Price : " + this.price);
        System.out.println("Now I have " + getNumberOfMotorcycle() + " Motocycles");
    }

    @Override
    public String toString() {
        return super.toString() + "Motorcycle [brand=" + brand + ", price=" + price + "]";
    }
   
}
