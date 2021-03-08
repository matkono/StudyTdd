package study_tdd;

import java.util.Iterator;
import java.util.List;

public class TicketProcessor {

    public TicketProcessor() {
    }
    
    public boolean ValidateInvoicePayment(List<Ticket> tickets, Invoice invoice){
        int total = 0;
        
        for(Iterator<Ticket> i = tickets.iterator(); i.hasNext();){
            total += i.next().getValue();
        }
        
        if(total >= invoice.getValue()){
            return true;
        }else{
            return false;
        }
    }
}
