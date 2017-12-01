package mk.ukim.finki.wp.web.laboratoriska3;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PizzaOrder.do")
public class PizzaOrder extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String size = request.getParameter("size");
        request.getSession().setAttribute("pizzaSize",size);
        response.sendRedirect("/DeliveryInfo.html");
    }
}
