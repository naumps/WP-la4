package mk.ukim.finki.wp.web.laboratoriska3.service;

import mk.ukim.finki.wp.web.laboratoriska3.model.Order;



public interface OrderService {
    public Order  placeOrder(String pizzaType, String clientName, String address);

}
