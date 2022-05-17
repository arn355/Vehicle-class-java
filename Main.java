import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Motorcycle motor = new Motorcycle(199, 30, "s1000", 378000);
        Car car = new Car(190, 25, "BMW", 275000);
        
        while(true){
            try {
                System.out.println("[1] Motorcycle [2] Car [3] Check Vehicle [4] Exit");
                int choiceVehicle = input.nextInt();
                if (choiceVehicle == 1) {
                    while(true){
                        System.out.println("[1] Status [2] Check kilometers [3] Drive [4] Increase Acceleration [5] Exit");
                        int choiceMotor = input.nextInt();
                        if (choiceMotor == 1) {
                            motor.status();
                        }else if (choiceMotor == 2) {
                            motor.displaySumOfMeter();
                        }else if (choiceMotor == 3) {
                            System.out.print("How much time you want to drive (hours) : ");
                            double time = input.nextDouble();
                            motor.drive(time);
                        }else if (choiceMotor == 4) {
                            System.out.print("How much time you will use to increase acceleration (negative number for decrease) : ");
                            double increaseAccel = input.nextDouble();
                            motor.accelerate(increaseAccel);
                            System.out.println("Now your acceleration is " + motor.getAccel() + " km/hr");
                        }else if (choiceMotor == 5) {
                            break;
                        }else {
                            System.out.println("Please enter correct syntax!");
                        }
                    }
                }else if (choiceVehicle == 2){
                    while(true){
                        System.out.println("[1] Status [2] Check kilometers [3] Drive [4] Increase Acceleration [5] Exit");
                        int choiceCar = input.nextInt();
                        if (choiceCar == 1) {
                            car.status();
                        }else if (choiceCar == 2) {
                            car.displaySumOfMeter();
                        }else if (choiceCar == 3) {
                            System.out.print("How much time you want to drive (hours) : ");
                            double time = input.nextDouble();
                            car.drive(time);
                        }else if (choiceCar == 4) {
                            System.out.print("How much time you will use to increase acceleration (negative number for decrease) : ");
                            double increaseAccel = input.nextDouble();
                            car.accelerate(increaseAccel);
                            System.out.println("Now your acceleration is " + car.getAccel() + " km/hr");
                        }else if (choiceCar == 5) {
                            break;
                        }else {
                            System.out.println("Please enter correct syntax!");
                        }
                    }
                }else if (choiceVehicle == 3){
                    System.out.println("Now you have " + Motorcycle.numberOfMotorcycle + " Motorcycles and " + Car.numberOfCar + " Cars");
                }else if (choiceVehicle == 4) {
                    break;
                }else {
                    System.out.println("Please enter 1 or 2");
                }
            } catch (Exception e) {
                // e.printStackTrace();
                System.out.println("Please enter correct syntax!");
                break;
            }
        }
        input.close();

    }
}
