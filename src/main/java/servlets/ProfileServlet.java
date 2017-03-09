package servlets;

/**
 * Original - http://www.javatpoint.com/servlet-http-session-login-and-logout-example
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet {

    /**
     * @param request  - standard http request
     * @param response - standard http response
     * @throws ServletException - standard ServletException
     * @throws IOException - standard IOException
     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("link.html").include(request, response);


        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");

        out.print(String.format("<center><h2> SessionID = %s </center></h2>", session.getId()));
        out.print(String.format("<center><h2> Entered name = %s </center></h2>", name));

        if (session != null && name != null) {
            out.print(String.format("<center><h2> Hello, %s Welcome to Profile</center></h2>", name));
        } else {
            out.print("<center><h2> Please login first ! </h2></center>");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }
        out.close();
    }
}