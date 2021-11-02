package Aula2_2.app;

import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;
 
public class App {
 
    public static void main(String[] args) throws Exception {
         
        Server server = new Server(8680);       
         
        ServletHandler servletHandler = new ServletHandler();
        server.setHandler(servletHandler);
                 
        servletHandler.addServletWithMapping(HelloServlet.class, "/");
         
        server.start();
        server.join();
 
    }
     
    public static class HelloServlet extends HttpServlet 
    {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            response.setContentType("text/html");
            response.setStatus(HttpServletResponse.SC_OK);
            try {
                String value1 = request.getParameter("param1");
                response.getWriter().println("<html>");
                response.getWriter().println("<head>");
                response.getWriter().println("<title>CalendarServlet</title>");
                response.getWriter().println("</head>");
                response.getWriter().println("<body>");
                response.getWriter().println("<h2>Hello " + value1  + "</h2>");
                response.getWriter().println("</body>");
                response.getWriter().println("</html>");
            } 
            catch(NullPointerException e) {
                System.out.println(e);
                System.exit(1);
            }
        } 
    }
 }
