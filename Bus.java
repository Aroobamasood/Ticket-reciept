package S2practice;

public class Bus extends Travel{
    String name;
    int cnic;
    int ticketno;
    String departure;
    String arrival;


    public Bus(String name, int cnic, int ticketno, String departure, String arrival) {
        this.name = name;
        this.cnic = cnic;
        this.ticketno = ticketno;
        this.departure = departure;
        this.arrival = arrival;
    }
    @Override
    public void print() {
        System.out.println("------------------------------Passenger Ticket----------------------------");
        System.out.println("name is "+name);
        System.out.println("cnic id is "+cnic);
        System.out.println("Ticket number is "+ticketno);
        System.out.println("Departure city is "+ departure);
        System.out.println("Arrival city is "+arrival);
    
}
}
