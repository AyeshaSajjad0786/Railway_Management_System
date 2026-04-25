package TrainManagementSystem;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Train {
    private int ID;
    private String Departure;
    private String Destination;
    private LocalTime DepartureTime;
    private LocalTime ArrivalTime;
    private LocalDate Date;
    private DateTimeFormatter TimeFormat = DateTimeFormatter.ofPattern("HH:mm");
    private DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public Train(){}
    public Train(int iD, String departure, String destination, LocalTime departureTime, LocalTime arrivalTime){
        this.ID=iD;
        this.Departure=departure;
        this.Destination=destination;
        this.DepartureTime=departureTime;
        this.ArrivalTime=arrivalTime;
    }
    public Train(int iD, String departure, String destination, LocalTime departureTime, LocalTime arrivalTime,LocalDate date) {
        ID = iD;
        Departure = departure;
        Destination = destination;
        DepartureTime = departureTime;
        ArrivalTime = arrivalTime;
        Date=date;
    }
    //GETTERS
    public int getID() {
        return ID;
    }
    public String getDeparture() {
        return Departure;
    }
    public String getDestination() {
        return Destination;
    }
    public String getDepartureTime() {
        return DepartureTime.format(TimeFormat);
    }
    public String getArrivalTime() {
        return ArrivalTime.format(TimeFormat);
    }
    public String getDate(){
        return Date.format(DateFormat);
    }
    //SETTERS
    public void setID(int iD) {
        ID = iD;
    }
    public void setDeparture(String departure) {
        Departure = departure;
    }
    public void setDestination(String destination) {
        Destination = destination;
    }
    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = LocalTime.parse(DepartureTime,TimeFormat);
    }
    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = LocalTime.parse(ArrivalTime,TimeFormat);
    }
    public void setDate(String Date){
        this.Date=LocalDate.parse(Date,DateFormat);
    }

}