import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            session.setAttribute("count", 1);
            count = 1;
        }
        else
            session.setAttribute("count", ++count);

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1> Your count is " + count + "</h1>");
        printWriter.println("</html>");

        /*String name = request.getParameter("name");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>hi fdsfds</h1>");
        printWriter.println("</html>");*/
//        or
//        response.sendRedirect("https://www.google.com");
//        response.sendRedirect("/testJSP.jsp");
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/testJSP.jsp");
//        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
