package repository;

import model.Trip;
import model.enumeration.City;
import repository.base.BaseRepository;

import java.sql.Date;
import java.util.List;

public interface TripRepository extends BaseRepository<Trip,Integer> {
    List<Trip> findAllBySrcToDstAndDate(City source, City destination, Date date);

}
