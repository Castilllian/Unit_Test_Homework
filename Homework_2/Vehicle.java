package Homework_2;

// Класс Vehicle
public abstract class Vehicle {
    protected String company;
    protected String model;
    protected int yearRelease;
    protected int numWheels;
    protected int speed;

    public abstract void testDrive();
    public abstract void park();

    // Конструктор
    public Vehicle(String company, String model, int yearRelease) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
    }



    // Геттеры и сеттеры
    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }

    // Другие методы
    // ...
}

