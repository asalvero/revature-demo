package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UpdateEmployeeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        // get data from form:
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");

        // create employee object:
        Employee employee = new Employee(name, email, gender);
        employee.setId(id);

        // create session:
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        // insert into database:
        session.update(employee);
        t.commit();
        session.close();

        out.println("Success! Employee updated");
        RequestDispatcher rd = req.getRequestDispatcher("/update.html");
        rd.include(req,resp);
    }
}
