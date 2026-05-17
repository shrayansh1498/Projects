interface vehicle
{
    void start();
}

public class FactoryDesignPatternBefore {
    public static void main(String[] args)
    {
        System.out.println("Creating Car object");
        String vehicleType = "Truck";
        if (vehicleType.equals("Car")) 
        {
            System.out.println("Car");
        } 
        else if (vehicleType.equals("Truck")) 
        {
            System.out.println("Truck");        } 
        else if (vehicleType.equals("Bike")) 
        {
            System.out.println("Bike");
        } 
        else 
        {
        throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
