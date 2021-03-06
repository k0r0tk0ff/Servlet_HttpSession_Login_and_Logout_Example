package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Original - http://www.javatpoint.com/servlet-http-session-login-and-logout-example
 */

public class LogoutServlet extends HttpServlet {

    /**
     * @param request  - standard http request
     * @param response - standard http response
     * @throws ServletException - standard ServletException
     * @throws IOException - standard IOException
     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        request.getRequestDispatcher("link.html").include(request, response);

        HttpSession session=request.getSession();
        session.invalidate();

        out.print("<center><h2> You are successfully logged out! </h2></center>");
        out.print(String.format("<center><h2> SessionID = %s </center></h2>", session.getId()));
        out.close();
    }
}