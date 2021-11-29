import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletOne extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("uname");
        out.print("");

        //creating a form that have invisible text field
        out.println("<form action='ServletTwo'");
        out.println("<input type='hidden' name='uname' value='"+name+"' />");
        out.println("<input type='Submit' value='send' />");
        out.println("</form>");
    }
}
