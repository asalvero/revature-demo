import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {
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

        // get cookies
        Cookie[] cookies = req.getCookies();
        boolean flag = false;
        String name = "";
        if(cookies == null){
            out.println("<h1>You are a new user, go to home page and sing up</h1>");
            return;
        }else{
            for(Cookie c: cookies){
                String tname = c.getName();
                if(tname.equals("user_name")){
                    flag = true;
                    name = c.getValue();
                }
            }
        }

        if (flag) {
            out.println("<h1>Hello "+name+"</h1>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
