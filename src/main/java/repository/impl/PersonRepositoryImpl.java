package repository.impl;

import model.Person;
import org.hibernate.Session;
import repository.PersonRepository;
import repository.base.BaseRepositoryImpl;


public class PersonRepositoryImpl extends BaseRepositoryImpl<Person, Integer> implements PersonRepository {
    @Override
    public Person login(String username, String password) {
        Session session = getSessionFactory().getCurrentSession();
        String sql = "select * from persons where username = :username AND password = :password";
        var query = session.createNativeQuery(sql,Person.class);
        query.setParameter("username",username);
        query.setParameter("password",password);
        return query.getSingleResult();
    }
}
