package org.example.dao;

import org.example.entities.Employee;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public int insert(Employee employee){
        //insert
        Integer integer = (Integer) this.hibernateTemplate.save(employee);
        return integer;
    }

    @Transactional
    public void delete(Employee employee){
        //delete
        this.hibernateTemplate.delete(employee);
    }

    public void update(Employee employee){
        //update
        this.hibernateTemplate.update(employee);
    }

    public Employee getById(int id){
        //getById
        Employee employee = (Employee) this.hibernateTemplate.get(Employee.class, id);
        return employee;
    }

    public List<Employee> getEmployees(){
        //getAll
        List<Employee> list = new ArrayList<Employee>();
        list = this.hibernateTemplate.loadAll(Employee.class);
        System.out.println(list);
        return list;
    }
}
