package S2practice;

public abstract class Travel {

String name;
int cnic;
int ticketno;
String departure;
String arrival;


    public Travel(String name, int cnic, int ticketno, String departure, String arrival) {
        this.name = name;
        this.cnic = cnic;
        this.ticketno = ticketno;
        this.departure = departure;
        this.arrival = arrival;
    }
public abstract void print();

    public Travel()
        {

    }
    
}
