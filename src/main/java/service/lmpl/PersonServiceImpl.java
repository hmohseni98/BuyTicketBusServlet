package service.lmpl;

import model.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;
import repository.PersonRepository;
import repository.impl.PersonRepositoryImpl;
import service.PersonService;
import service.base.BaseServiceImpl;

public class PersonServiceImpl extends BaseServiceImpl<PersonRepositoryImpl, Person, Integer> implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl() {
        super(new PersonRepositoryImpl(), Person.class);
        personRepository = new PersonRepositoryImpl();
    }

    @Override
    public Person login(String username, String password) {
        Person person = null;
        try (Session session = getSessionFactory().getCurrentSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                person = personRepository.login(username, password);
                transaction.commit();
            } catch (Exception ex) {
                transaction.rollback();
                System.out.println(ex.getMessage());
                return null;
            }
        }
        return person;
    }
}
