import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet State Management- Cookies</title>");
        out.println("</head>");
        out.println("<body>");

        String name = req.getParameter("name");

        //create a cookie
        Cookie cookie = new Cookie("user_name", name);
        resp.addCookie(cookie);

        out.println("<h1>Hello "+name+", welcome to my website</h1>");
        out.println("<h1><a href='servlet2'>Go to Servlet2</a></h1>");
        out.println("</body>");
        out.println("</html>");


    }
}
