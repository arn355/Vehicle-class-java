public abstract class Engine {
    private int max_speed;
    private double accel;
    private double ageHr;
    private double sumOfkm;

    public Engine() {
    }

    public Engine(int max_speed, int accel) {
        this.max_speed = max_speed;
        this.accel = accel;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public double getAccel() {
        return accel;
    }

    public void setAccel(double accel) {
        this.accel = accel;
    }

    public double getSumOfkm() {
        return sumOfkm;
    }

    public void setSumOfkm(double sumOfkm) {
        this.sumOfkm = sumOfkm;
    }

    public double getAgeHr() {
        return ageHr;
    }

    public void setAgeHr(double ageHr) {
        this.ageHr = ageHr;
    }

    public void status() {
        System.out.println("Max Speed : " + this.max_speed);
        System.out.println("Sum of kilometers : " + this.sumOfkm);
        System.out.println("Age (hours) : " + this.ageHr);
        System.out.println("Acceleration : " + this.accel + " km/hr");
    }

    public abstract void accelerate(double increaseAccel);

    @Override
    public String toString() {
        return "Engine [accel=" + accel + ", ageHr=" + ageHr + ", max_speed=" + max_speed + ", sumOfkm=" + sumOfkm
                + "]";
    }
   
}