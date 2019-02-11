
public class Flight {
    private Airplane airplane;
    private String airports;
    
    public Flight(Airplane plane, String airports){
        this.airplane = plane;
        this.airports = airports;
    }
    
    public String getPlane(){
        return this.airplane.getID();
    }
    
    public String getPlaneCapacity(){
        return this.airplane.getCapacity();
    }
    
    public String getAirports(){
        return this.airports;
    }
}
