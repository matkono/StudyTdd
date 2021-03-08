import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;

public class TicketProcessorTest {
    private TicketProcessor ticketProcessor;
    
    @BeforeAll
    public static void setUp() {
        ticketProcessor = new TicketProcessor();
    }
   
    @Test
    public void InvoicePaid(){
        //Arrange
        List<Ticket> tickets = new ArrayList<Ticket>();
        Ticket ticketOne = new Ticket("00001", "03/08/2021", 100);
        Ticket ticketTwo = new Ticket("00002", "03/07/2021", 100);
        Invoice invoice = new Invoice("03/10/2021", 200, "Client name");
        tickets.Add(ticketOne);
        tickets.Add(ticketTwo);
        
        //Action
        boolean isTicketPaid = ticketProcessor.ValidateInvoicePayment(tickets, invoice);
        
        //Assert
        assertEquals(true, isTicketPaid);
    }
    
    @Test
    public void InvoiceNotPaid(){
        //Arrange
        List<Ticket> tickets = new ArrayList<Ticket>();
        Ticket ticketOne = new Ticket("00001", "03/08/2021", 90);
        Ticket ticketTwo = new Ticket("00002", "03/07/2021", 100);
        Invoice invoice = new Invoice("03/10/2021", 200, "Client name");
        tickets.Add(ticketOne);
        tickets.Add(ticketTwo);
        
        //Action
        boolean isTicketPaid = ticketProcessor.ValidateInvoicePayment(tickets, invoice);
        
        //Assert
        assertEquals(false, isTicketPaid);
    }
}
