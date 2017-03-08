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

public class LoginServlet extends HttpServlet {

    /**
     * @param request  - standard http request
     * @param response - standard http response
     * @throws ServletException - standard ServletException
     * @throws IOException - standard IOException
     */

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("link.html").include(request, response);

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        if (password.equals("a")) {
            out.print("Welcome, " + name);
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
        } else {
            out.print("Sorry, username or password error!");
            request.getRequestDispatcher("login.jsp").include(request, response);
        }
        out.close();
    }
}