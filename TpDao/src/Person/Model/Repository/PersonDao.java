package Person.Model.Repository;

import Person.Model.Entity.Person;
import interfaces.Dao;

import java.util.ArrayList;
import java.util.List;

public class PersonDao implements Dao<Person> {
    private List<Person> personList = new ArrayList<>();
    private static int newID = 0;

    @Override
    public void create(long dni) {
        Person person = new Person(dni);
        person.setId(newID++);// primero lo usa y después lo incrementa. ( lo contrario a ++nextId que primero incrementa y después lo usa)
        this.personList.add(person);
    }

    @Override
    public Person update(int id) {
        return findbyID(id);
    }

    @Override
    public List<Person> readAll() {
        return this.personList;
    }

    @Override
    public boolean delete(int id) {
        Person person = findbyID(id);
        if(person != null){
            this.personList.remove(person);
            return true;
        }else{
            return false;
        }
    }
    public Person findbyID(int id){
        for(Person person: this.personList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    @Override
    public Person readById(int id) {
       return findbyID(id);
    }
}
