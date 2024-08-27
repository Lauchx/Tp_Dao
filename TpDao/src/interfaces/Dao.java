package interfaces;
import Person.Model.Entity.Person;

import java.util.List;

public interface Dao<T>{
        public void create(long dni);
        public Person update(int id); // si el id esta en el T, no es necesario como parametro
        public List<T> readAll();
        public boolean delete(int id);
        public T readById(int id);
}
