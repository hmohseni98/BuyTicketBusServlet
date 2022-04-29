package repository;

import model.Person;
import repository.base.BaseRepository;

public interface PersonRepository extends BaseRepository<Person, Integer> {
    Person login(String username, String password);
}
