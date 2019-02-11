import java.util.Scanner;
import java.util.ArrayList;

public class AirportPanel {
    private Scanner reader;
    private ArrayList<Airplane> airplanes;
    private ArrayList<Flight> flights;
    
    public AirportPanel(Scanner reader){
        this.reader = reader;
        this.airplanes = new ArrayList<Airplane>();
        this.flights = new ArrayList<Flight>();
    }
    
    public void start(){
        System.out.println("Airport panel");
        System.out.println("--------------------\n");
        
        while(true){
            printMenu();
            String input = readString();
            if(input.toLowerCase().equals("x")){
                break;
            }else{
                chooseOperation(input);
            }
        }
    }
    
    private void printMenu(){
        System.out.println("Choose operation");
        System.out.println("[1] Add airplane" + "\n[2] Add flight" + "\n[x] Exit");
        System.out.print(">");        
    }
    
    private void chooseOperation(String input){
        if(input.equals("1")){
            addPlane();
        }else{
            addFlight();
        }
    }
    
    private void addPlane(){
        System.out.print("Give plane ID:");
        String planeID = readString();
        System.out.print("Give plane capacity: ");
        String planeCap = readString();
        
        this.airplanes.add(new Airplane(planeID, planeCap));
        System.out.println("");
    }
    
    private void addFlight(){
        System.out.print("Give Plane ID: ");
        String planeID = readString();
        System.out.print("Give departure airport code: ");
        String airport1 = readString();
        System.out.print("Give destination airport code: ");
        String airport2 = readString();
        System.out.println("\n");
        
        String airports = airport1 + "-" + airport2;
        
        for(Airplane ap : this.airplanes){
            if(ap.getID().equals(planeID)){
                this.flights.add(new Flight(ap, airports));
            }
        }
    }
    
    private String readString(){
        return this.reader.nextLine();
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //                       PRINT METHODS
    
    public void printPlanes(){
        for(Airplane apl : this.airplanes){
            System.out.println(apl.getID() + " (" + apl.getCapacity() + " ppl)");
        }
    }
    
    public void printFlights(){
        for(Flight fl : this.flights){
            System.out.println(fl.getPlane() + " (" + fl.getPlaneCapacity() + " ppl)" +
                    " (" + fl.getAirports() + ")");
        }
    }
    
    public void printPlaneInfo(String plane){
        for(Airplane pl : this.airplanes){
            if(pl.getID().equals(plane)){
                System.out.println(pl.getID() + " (" + pl.getCapacity() + " ppl)");
            }
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
