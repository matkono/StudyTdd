import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import study_tdd.Invoice;
import study_tdd.Ticket;
import study_tdd.TicketProcessor;

public class TicketProcessorTest {
    private TicketProcessor ticketProcessor= new TicketProcessor();
    
    @Test
    public void InvoicePaid(){
        //Arrange
        List<Ticket> tickets = new ArrayList<>();
        Ticket ticketOne = new Ticket("00001", "03/08/2021", 100);
        Ticket ticketTwo = new Ticket("00002", "03/07/2021", 100);
        Invoice invoice = new Invoice("Client name", "03/10/2021", 200);
        tickets.add(ticketOne);
        tickets.add(ticketTwo);
        
        //Action
        boolean isTicketPaid = ticketProcessor.ValidateInvoicePayment(tickets, invoice);
        
        //Assert
        assertEquals(true, isTicketPaid);
    }
    
    @Test
    public void InvoiceNotPaid(){
        //Arrange
        List<Ticket> tickets = new ArrayList<>();
        Ticket ticketOne = new Ticket("00001", "03/08/2021", 90);
        Ticket ticketTwo = new Ticket("00002", "03/07/2021", 100);
        Invoice invoice = new Invoice("Client name", "03/10/2021", 200);
        tickets.add(ticketOne);
        tickets.add(ticketTwo);
        
        //Action
        boolean isTicketPaid = ticketProcessor.ValidateInvoicePayment(tickets, invoice);
        
        //Assert
        assertEquals(false, isTicketPaid);
    }
}
