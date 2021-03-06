public class Car extends Engine implements Process {
    static int numberOfCar;
    private String brand;
    private double price;

    public Car() {
        numberOfCar++;
    }

    public Car(int max_speed, int accel, String brand, double price) {
        super(max_speed, accel);
        numberOfCar++;
        this.brand = brand;
        this.price = price;
    }

    public static int getNumberOfCar() {
        return numberOfCar;
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
        setAccel(getAccel() * (increaseAccel/2));
    }

    @Override
    public void status() {
        super.status();
        System.out.println("Name : " + this.brand);
        System.out.println("Price : " + this.price);
        System.out.println("Now I have " + getNumberOfCar() + " Cars");
    }

    @Override
    public String toString() {
        return super.toString() + "Car [brand=" + brand + ", price=" + price + "]";
    }
    
}
