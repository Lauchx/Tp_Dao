package Person.View;

import Person.Model.Entity.Person;
import java.util.List;
import java.util.Scanner;

public class PersonView {
    public Scanner keyboard = new Scanner(System.in);

    private void resetKeyboard(){
        this.keyboard = new Scanner(System.in);
    }
    public long create(){
        resetKeyboard();
        System.out.println("Ingrese el dni");
        return this.keyboard.nextInt();
    }
    public void readAll(List<Person> personList){
        for(Person person : personList){
            System.out.println(person);
        }
    }
    public int giveID(){
        resetKeyboard();
        System.out.println("Ingrese el id a buscar");
        return this.keyboard.nextInt();
    }
    public void readById(Person person){
        if(person != null) {
            System.out.println("Se encontraron resultados");
            System.out.println(person);
        }
        else {
            System.out.println("No hubo resultados");
        }
    }
    public void update(Person person){
        if(person != null){
            System.out.println("Escribe el nuevo dni");
            person.setDni(this.keyboard.nextLong());
        }else {
            System.out.println("No hubo resultados");
        }
    }
    public void delete(boolean bol){
        if(bol){
            System.out.println("Persona eliminada con éxito");
        }
        else{
            System.out.println("No hubo resultados");
        }
    }
}
