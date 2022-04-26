package services;

import models.person.Employee;

public interface Services {
    public void display();

    public  void addNew();

    public void edit();



    public Object isExisted(int id);
}
