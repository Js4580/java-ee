package Cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie_1 = new Cookie("some_id", "123");
        Cookie cookie_2 = new Cookie("some_name", "4580");

        cookie_1.setMaxAge(24 * 60 * 60);
        cookie_2.setMaxAge(24 * 60 * 60);

        response.addCookie(cookie_1);
        response.addCookie(cookie_2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
