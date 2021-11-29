import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("username");

        out.print("    <!-- Required meta tags -->\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                "\n" +
                "    <!-- Bootstrap CSS -->\n" +
                "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\" integrity=\"sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn\" crossorigin=\"anonymous\">" );

        out.print("<ul class=\"nav justify-content-center\">\n" +
                "    <li class=\"nav-item\">\n" +
                "        <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\n" +
                "    </li>\n" +
                "    <li class=\"nav-item\">\n" +
                "        <a class=\"nav-link\" href=\"http://localhost:63342/Exercise2/src/main/webapp/login.html?_ijt=osla7rb0ijg96polg6jdsotctq&_ij_reload=RELOAD_ON_SAVE\">Login</a>\n" +
                "    </li>\n" +
                "    <li class=\"nav-item\">\n" +
                "        <a class=\"nav-link\" href=\"http://localhost:63342/Exercise2/src/main/webapp/logout.html?_ijt=jqno63k5l50oopgvi6s24cjspg&_ij_reload=RELOAD_ON_SAVE\">Logout</a>\n" +
                "    </li>\n" +
                " <li class=\"nav-item\">\n" +
                "        <a class=\"nav-link\" href=\"http://localhost:63342/Exercise2/src/main/webapp/login.html?_ijt=osla7rb0ijg96polg6jdsotctq&_ij_reload=RELOAD_ON_SAVE\">Profile</a>\n" +
                "    </li>" +
                "</ul>" + "<br>");

        out.print("<h1 class=\"row justify-content-center\">Welcome, "+name+"!</h1>");
    }
}
