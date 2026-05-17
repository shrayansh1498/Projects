interface vehicle
{
    void start();
}

public class FactoryDesignPatternBefore {
    public static void main(String[] args)
    {
        System.out.println("Creating Car object");
        String vehicleType = "Airplane";
        if (vehicleType.equals("Airplane")) 
        {
            System.out.println("Airplane");
        } 
        else if (vehicleType.equals("Boat")) 
        {
            System.out.println("Boat");        
        } 
        else 
        {
        throw new IllegalArgumentException("vehicle type is not known");
        }
    }
}
