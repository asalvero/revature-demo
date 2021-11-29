package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class ListEmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        // initialize table
        out.print("<table border='1'");
        out.print("<tr><th>ID</th><th>Name</th><th>Email</th><th>Gender</th>");

        //create the session
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Query query = session.createQuery("from Employee e");

        List list = query.list();
        System.out.println("Total Number of Records : " + list.size());
        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            Object o = (Object)iterator.next();
            Employee e = (Employee) o;
            out.print("<tr>");
            out.print("<td>"+ e.getId() + "</td>");
            out.print("<td>"+ e.getName() + "</td>");
            out.print("<td>"+ e.getEmail() + "</td>");
            out.print("<td>"+ e.getGender() + "</td>");
            out.print("</tr>");
        }
        out.print("</table>");
    }
}
