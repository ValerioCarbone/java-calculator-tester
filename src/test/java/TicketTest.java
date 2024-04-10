import org.experis.bonus.Ticket;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTest {

    Ticket ticket;

    @Test
    @DisplayName("Test ticket price calculator")
    void testPrice() {

        ticket = new Ticket(17, 220);

        assertEquals(36.96, (ticket.getPrice().doubleValue()), 0.001);

        System.out.println("U18 price is: " + ticket.getPrice().doubleValue());

        ticket = new Ticket(18, 90);

        assertEquals(18.90, (ticket.getPrice().doubleValue()), 0.001);

        System.out.println("Basic price is: " + ticket.getPrice().doubleValue());

        ticket = new Ticket(65, 350);

        assertEquals(44.1, (ticket.getPrice().doubleValue()), 0.001);

        System.out.println("O65 price is: " + ticket.getPrice().doubleValue());

    }
}
