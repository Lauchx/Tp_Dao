package Person.Controller;

import Person.Model.Repository.PersonDao;
import Person.View.PersonView;

public class PersonController {
    public PersonView personView;
    public PersonDao personDao;

    public PersonController(){
        this.personView = new PersonView();
        this.personDao = new PersonDao();
    }
    public void create(){
       this.personDao.create(this.personView.create());
    }
    public void readAll(){
        this.personView.readAll(this.personDao.readAll());
    }
    public void readById(){
        this.personView.readById(this.personDao.readById(this.personView.giveID()));
    }
    public void update(){
        this.personView.update(this.personDao.update(this.personView.giveID()));
    }
    public void delete(){
        this.personView.delete(this.personDao.delete(this.personView.giveID()));
    }





}
