package Aula2_1.app;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(name = "MyFirstServlet", urlPatterns = {"/MyFirstServlet"})
public class App extends HttpServlet {
 
    private static final long serialVersionUID = -1915463532411657451L;
 
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        try {
            String value1 = request.getParameter("param1");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>CalendarServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Hello " + value1  + "</h2>");
            out.println("</body>");
            out.println("</html>");
        } 
        catch(NullPointerException e) {
            System.out.println(e);
            System.exit(1);
        } finally {
            out.close();
        }
    }
     
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
       // ...
    }
}