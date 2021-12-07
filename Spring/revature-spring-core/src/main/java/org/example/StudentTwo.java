package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StudentTwo implements InitializingBean, DisposableBean{
    private String name;

    public StudentTwo() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentTwo{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init called");
    }
}
