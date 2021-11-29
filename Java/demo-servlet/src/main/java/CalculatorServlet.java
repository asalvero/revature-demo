import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<h1>Welecome to Calculator Servlet!</h1>");
        int num1 = Integer.parseInt(req.getParameter("number_one"));
        int num2 = Integer.parseInt(req.getParameter("number_two"));
        int sum = num1 + num2;

        pw.println("The sum is: " + sum);
    }
}
