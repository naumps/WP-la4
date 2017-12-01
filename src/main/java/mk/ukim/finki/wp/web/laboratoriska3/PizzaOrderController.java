package mk.ukim.finki.wp.web.laboratoriska3;

import mk.ukim.finki.wp.web.laboratoriska3.service.OrderService;
import mk.ukim.finki.wp.web.laboratoriska3.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/lab")
public class PizzaOrderController {
    private PizzaService ps;
    private OrderService os;

    @Autowired
    public PizzaOrderController(PizzaService ps) {
        this.ps = ps;
    }


    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("OrderForm.html");
        modelAndView.addObject("list", ps.getPizzaTypes());
        return modelAndView;
    }

    @RequestMapping(value = "/pizza_index", method = RequestMethod.GET)
    public ModelAndView showClientInfo(@RequestParam String pizzaType, HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("DeliveryInfo.html");
        return modelAndView;
    }


}
