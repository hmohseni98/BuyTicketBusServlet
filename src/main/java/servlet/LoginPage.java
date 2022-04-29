package servlet;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Person;
import service.lmpl.PersonServiceImpl;

@WebServlet(name = "loginPage", value = "/login-page")
public class LoginPage extends HttpServlet {
    private final PersonServiceImpl personService = new PersonServiceImpl();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Person person = personService.login(username, password);
        if (person != null) {
            request.getSession().setAttribute("sec_data",person);
            response.sendRedirect("dir/panel.jsp");
        } else {
            response.sendRedirect("dir/forbidden.jsp");
        }
    }
}