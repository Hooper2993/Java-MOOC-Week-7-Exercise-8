import java.util.Scanner;

public class FlightService {
    private Scanner reader;
    private AirportPanel ap;
    
    public FlightService(Scanner reader, AirportPanel airportPanel){
        this.reader = reader;
        this.ap = airportPanel;
    }
    
    public void start(){
        System.out.println("Flight service");
        System.out.println("------------\n");
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
        System.out.println("[1] Print planes" + "\n[2] Print flights" + "\n[3] Print plane info" + "\n[x] Quit");
        System.out.print(">"); 
    }
    
    private void chooseOperation(String input){
        if(input.equals("1")){
            ap.printPlanes();
        }else if(input.equals("2")){
            ap.printFlights();
        }else{
            System.out.print("Give plane ID: ");
            String planeID = readString();
            ap.printPlaneInfo(planeID);
        }
    }
    
    
    private String readString(){
        return this.reader.nextLine();
    }
}
