package my.projects.spring.dao.impl;

import my.projects.spring.dao.AbstractDao;
import my.projects.spring.dao.TicketDao;
import my.projects.spring.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
