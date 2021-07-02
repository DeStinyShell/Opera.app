package my.projects.spring.dao.impl;

import my.projects.spring.dao.AbstractDao;
import my.projects.spring.dao.CinemaHallDao;
import my.projects.spring.model.CinemaHall;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
