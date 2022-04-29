package service;

import model.Trip;
import model.enumeration.City;
import service.base.BaseService;

import java.sql.Date;
import java.util.List;

public interface TripService extends BaseService<Trip, Integer> {
    List<Trip> findAllBySrcToDstAndDate(City source, City destination, Date date);

}
