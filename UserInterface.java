import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private AirportPanel ap;
    private FlightService fs;
    
    public UserInterface(Scanner reader){
        this.reader = reader;        
    }
    
    public void start(){
        AirportPanel ap = new AirportPanel(this.reader);
        ap.start();
        
        FlightService fs = new FlightService(this.reader, ap);
        fs.start();
    }
}
