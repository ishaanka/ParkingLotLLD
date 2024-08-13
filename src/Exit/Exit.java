package Exit;
import CalculationStrategy.ICalculationStrategy;
import Ticket.Ticket;

public class Exit {
    public Ticket ticket;
    public int currentTime;
    public ICalculationStrategy calculationStrategy;

    public Exit(Ticket ticket, ICalculationStrategy calculationStrategy) {
        this.ticket = ticket;
        this.calculationStrategy = calculationStrategy;
        this.currentTime = 1000;
    }

    public int getPrice() {
        int entryTime = ticket.entryTime;
        return calculationStrategy.calculatePrice(ticket.parkingSpot.price, currentTime-entryTime);
    }

    public void makePayment() {
        System.out.println("Making Payment");
    }
}
