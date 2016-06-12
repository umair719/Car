package car;

public class Car {

    private int maxSpeed = 100;
    private int minSpeed = 0;

    private double weight = 4079;

    private boolean isTheCarOn = false;

    private char condition = 'A';

    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        setMaxSpeed(customMaxSpeed);
        setWeight(customWeight);
        setTheCarOn(customIsTheCarOn);
    }

    public void getIn() {
        numberOfPeopleInCar++;
    }

    public void getOut() {
        numberOfPeopleInCar--;
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public double calcualteMpg() {
        maxSpeed++;
        return howManyMilesTillOutOfGas();
    }

    public static void main(String[] args) {
        System.out.println("Birthday Car");
        Car birthdayPresent = new Car(500, 5000.545, true);
        birthdayPresent.printVaribles();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles Left: " + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max Miles: " + birthdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday Car v2");
        birthdayPresent.printVaribles();
        birthdayPresent.getOut();
        System.out.println("Birthday Car v2");
        birthdayPresent.printVaribles();



//        System.out.println("Christmas Car");
//        Car christmasPresent = new Car(550, 2000, false);
//        christmasPresent.printVaribles();
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isTheCarOn() {
        return isTheCarOn;
    }

    public void setTheCarOn(boolean theCarOn) {
        isTheCarOn = theCarOn;
    }

    public char getCondition() {
        return condition;
    }

    public void setCondition(char condition) {
        this.condition = condition;
    }

    public void printVaribles() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(numberOfPeopleInCar);
    }

    public void wreckCar() {
        setCondition('C');
    }

    public void updateMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }
}



