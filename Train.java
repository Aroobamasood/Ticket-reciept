package S2practice;

public class Train extends Travel implements Boarding{
    String name;
    int cnic;
    int ticketno;
    String departure;
    String arrival;
    int gateno;
    int Trainno;
    double weight;
    int luggageid;

    public Train(String name, int cnic, int ticketno, String departure, String arrival) {
        this.name = name;
        this.cnic = cnic;
        this.ticketno = ticketno;
        this.departure = departure;
        this.arrival = arrival;
    }

    public int getGateno() {
        return this.gateno;
    }

    public void setGateno(int gateno) {
        this.gateno = gateno;
    }

    public int getTrainno() {
        return this.Trainno;
    }

    public void setTrainno(int Trainno) {
        this.Trainno = Trainno;
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
    @Override
    public void boardingPass() {
        setTrainno(Trainno);
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
            System.out.println("Train no is "+getTrainno());
            System.out.println("Luggage weight  is "+getWeight());
            System.out.println("Luggage id is "+getLuggageid());
    
    
        }
    

    
}
