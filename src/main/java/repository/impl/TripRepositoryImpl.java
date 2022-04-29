package repository.impl;

import model.Trip;
import model.enumeration.City;
import org.hibernate.Session;
import repository.TripRepository;
import repository.base.BaseRepositoryImpl;


import java.sql.Date;
import java.util.List;

public class TripRepositoryImpl extends BaseRepositoryImpl<Trip,Integer> implements TripRepository {
    @Override
    public List<Trip> findAllBySrcToDstAndDate(City source, City destination, Date date) {
        Session session = getSessionFactory().getCurrentSession();
        String sql = "select * from trips where destination = :des AND source = :src AND date = :date";
        var query = session.createNativeQuery(sql,Trip.class);
        query.setParameter("des",String.valueOf(destination));
        query.setParameter("src",String.valueOf(source));
        query.setParameter("date",date);
        return query.getResultList();
    }
}
