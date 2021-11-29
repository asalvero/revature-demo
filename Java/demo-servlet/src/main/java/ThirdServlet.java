import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ThirdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        System.out.println("this is get method of my servlet");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1>Get method called</h1>");
        out.print(new Date().toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        System.out.println("this is post method of my servlet");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1>Post method called</h1>");
        out.print(new Date().toString());
    }
}
