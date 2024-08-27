package Person.Model.Entity;

public class Person {
    public int id;
    public long dni;

   public Person(long dni){
        this.id = 0;
        this.dni = dni;
    }

    public int getId() {
       return this.id;
    }

    public void setId(int id) {
       this.id = id;
    }
    @Override
    public String toString(){
        return "Soy la persona numero: " +  id + ", con el dni: " + dni;
    }

    public void setDni(long dni) {
       this.dni = dni;
    }
}
