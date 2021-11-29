import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //when user enter correct details
        if(username.equals("admin") && password.equals("123")){
            RequestDispatcher rd = req.getRequestDispatcher("welcomeservlet");
            rd.forward(req, resp);
        }else{
            out.println("Sorry, invalid username and password");
            RequestDispatcher rd = req.getRequestDispatcher("/login.html");
            rd.include(req,resp);
        }
    }
}
