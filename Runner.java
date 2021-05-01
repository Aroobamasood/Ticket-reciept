package S2practice;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
int cnic;
int ticketno;
String departure;
String arrival;
int choice;
        System.out.println("Enter name ");
        name=in.nextLine();
        System.out.println("Enter cnic ");
        cnic=in.nextInt();
        System.out.println("Enter ticket no ");
        ticketno=in.nextInt();
        in.nextLine();
        System.out.println("Enter departure City ");
        departure=in.nextLine();
        System.out.println("Enter arrival City ");
        arrival=in.nextLine();
System.out.println("Enter Travel Option");
System.out.println("1-Air");
System.out.println("2-train");
System.out.println("3-bus ");
choice=in.nextInt();
if (choice==1) {
    Air p=new Air(name,cnic,departure,ticketno,arrival);
        System.out.println("Enter luggage id ");
        p.setLuggageid(in.nextInt());
        System.out.println("enter weight ");
        p.setWeight(in.nextInt());
        System.out.println("enter flight no ");
        p.setFlightno(in.nextInt());
        System.out.println("enter gate no ");

        p.setGateno(in.nextInt());
        p.luggageDetails();
        p.boardingPass();
        p.print();
}
else if (choice==2) {
    Train t=new Train(name, cnic, ticketno, departure, arrival);
    System.out.println("Enter luggage id ");
    t.setLuggageid(in.nextInt());
    System.out.println("enter weight ");
    t.setWeight(in.nextInt());
    System.out.println("enter flight no ");
    t.setTrainno(in.nextInt());
    System.out.println("enter gate no ");

    t.setGateno(in.nextInt());
    t.luggageDetails();
    t.boardingPass();
    t.print();
    
}
else if (choice==3) {
    Bus b=new Bus(name, cnic, ticketno, departure, arrival);
    b.print();
    
}
        
    }
    
}
