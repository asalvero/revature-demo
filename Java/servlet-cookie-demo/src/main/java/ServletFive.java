import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletFive extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        // getting the value from query string
        String name = req.getParameter("name");
        out.println("Welcome to Servlet 5: " + name);

        HttpSession session = req.getSession();
        session.setAttribute("uname", name);
        out.println("<a href='Servlet6'>Click here</a>");
        out.close();
    }
}
