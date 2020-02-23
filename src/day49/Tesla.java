package day49;

import day13.TestStringStartWithOrEndWith;

public class Tesla extends Vehicle implements Autonomous {

    int horsePower;
    String model;

    public Tesla(int year,
                 int horsePower,
                 String model){
            super(year);
            this.horsePower = horsePower;
            this.model = model;

    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla model " + model + "Self-Driven");
    }

    @Override
    public void start() {
        System.out.println("Tesla Model " + model + "start with electricity");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
