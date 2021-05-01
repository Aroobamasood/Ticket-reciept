package S2practice;

public class Air extends Travel implements Boarding {

    String name;
    int cnic;
    int ticketno;
    String departure;
    String arrival;
    int gateno;
    int flightno;
    double weight;
    int luggageid;



    public Air(String name, int cnic, String departure,int ticketno, String arrival) {

        this.name = name;
        this.cnic = cnic;
        this.departure = departure;
        this.ticketno = ticketno;
        this.arrival = arrival;
    }
    

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLuggageid() {
        return this.luggageid;
    }

    public void setLuggageid(int luggageid) {
        this.luggageid = luggageid;
    }

    public int getGateno() {
        return this.gateno;
    }

    public void setGateno(int gateno) {
        this.gateno = gateno;
    }

    public int getFlightno() {
        return this.flightno;
    }

    public void setFlightno(int flightno) {
        this.flightno = flightno;
    }

@Override
public void boardingPass() {
    setFlightno(flightno);
    setGateno(gateno);
    getLuggageid();
    getWeight();

}
@Override
public void luggageDetails() {
    // TODO Auto-generated method stub
setWeight(weight);
setLuggageid(luggageid);
    
    }
    @Override
    public void print() {
        System.out.println("------------------------------Passenger Ticket----------------------------");
        System.out.println("name is "+name);
        System.out.println("cnic id is "+cnic);
        System.out.println("Ticket number is "+ticketno);
        System.out.println("Departure city is "+ departure);
        System.out.println("Arrival city is "+arrival);
        System.out.println("------------------------------Boarding Pass-------------------------------");

        System.out.println("Gate no is "+ getGateno());
        System.out.println("Flight no is "+getFlightno());
        System.out.println("Luggage weight  is "+getWeight());
        System.out.println("Luggage id is "+getLuggageid());


    }

    
}
    

