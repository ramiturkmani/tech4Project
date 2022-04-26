package singleton;

public class Driver {

    private static Driver driver; // declared

    private Driver(){

    }

    public static Driver getDriver(){
        if (driver == null) driver = new Driver();
        return driver;
    }
}
