package org.example;

public class EmployeeTwo {
    private String name;

    public EmployeeTwo(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setter called");
    }

    @Override
    public String toString() {
        return "EmployeeTwo{" +
                "name='" + name + '\'' +
                '}';
    }

    public void init(){
        System.out.println("init is called");
    }

    public void destroy(){
        System.out.println("destroy is called");
    }
}
