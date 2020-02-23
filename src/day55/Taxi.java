package day55;

public class Taxi {


    int plateNumber;
    // just like String , we have class Engine
    // so I can use it as data type for my field
    Engine eng;
    // just like String , we have class Driver
    // so I can use it as data type for my field
    Driver dr;

    public Taxi(int plateNumber, Engine eng, Driver dr) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.dr = dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "Plate Number=" + plateNumber +
                ", Engine =" + eng.toString() +
                ", Driver =" + dr.toString() +
                '}';
    }
}

class Driver {

    String name;
    int driverID;

    public Driver(String name, int driverID) {
        this.name = name;
        this.driverID = driverID;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverID=" + driverID +
                '}';
    }
}







class Engine {

    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
