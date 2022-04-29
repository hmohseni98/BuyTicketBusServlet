package service;

import model.Person;
import service.base.BaseService;

public interface PersonService extends BaseService<Person, Integer> {
    Person login(String username, String password);
}
