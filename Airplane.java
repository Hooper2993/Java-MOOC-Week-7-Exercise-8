
public class Airplane {
    private String planeID;
    private String capacity;
    
    public Airplane(String planeID, String capacity){
        this.planeID = planeID;
        this.capacity = capacity;
    }
    
    public String getID(){
        return this.planeID;
    }
    
    public String getCapacity(){
        return this.capacity;
    }
}
