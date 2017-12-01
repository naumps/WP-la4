package mk.ukim.finki.wp.web.laboratoriska3;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/AddressInfo.do")
public class AddressInfo extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String size = request.getSession().getAttribute("PizzaSize").toString();
        String ime = request.getParameter("ime");
        String adresa = request.getParameter("adresa");

        response.getWriter().println(request.getHeader("User-Agent"));
        response.getWriter().println();
        response.getWriter().println("Golemina: " + size);
        response.getWriter().println("Ime: " + ime);
        response.getWriter().println("Adresa: " + adresa);


    }
}
