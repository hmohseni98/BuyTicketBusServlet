package service.lmpl;

import model.Trip;
import model.enumeration.City;
import org.hibernate.Session;
import org.hibernate.Transaction;
import repository.impl.TripRepositoryImpl;
import service.TripService;
import service.base.BaseServiceImpl;

import java.sql.Date;
import java.util.List;

public class TripServiceImpl extends BaseServiceImpl<TripRepositoryImpl, Trip, Integer> implements TripService {
    private TripRepositoryImpl tripRepository;
    public TripServiceImpl() {
        super(new TripRepositoryImpl(), Trip.class);
        tripRepository = new TripRepositoryImpl();
    }

    @Override
    public List<Trip> findAllBySrcToDstAndDate(City source, City destination, Date date) {
        List<Trip> trips = null;
        try(Session session = getSessionFactory().getCurrentSession()){
            Transaction transaction = session.beginTransaction();
            try{
                trips = tripRepository.findAllBySrcToDstAndDate(source, destination, date);
                transaction.commit();
            } catch (Exception ex){
                transaction.rollback();
                System.out.println(ex.getMessage());
            }
        }
        return trips;
    }
}
