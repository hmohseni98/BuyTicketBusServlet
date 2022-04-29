package service.lmpl;

import model.Ticket;
import repository.impl.TicketRepositoryImpl;
import service.TicketService;
import service.base.BaseServiceImpl;

public class TicketServiceImpl extends BaseServiceImpl<TicketRepositoryImpl, Ticket, Integer> implements TicketService {
    public TicketServiceImpl() {
        super(new TicketRepositoryImpl(), Ticket.class);
    }
}
