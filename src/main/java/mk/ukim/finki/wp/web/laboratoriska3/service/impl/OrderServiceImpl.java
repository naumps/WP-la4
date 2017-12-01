package mk.ukim.finki.wp.web.laboratoriska3.service.impl;

import mk.ukim.finki.wp.web.laboratoriska3.model.Order;
import mk.ukim.finki.wp.web.laboratoriska3.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Random;


@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Order placeOrder(String pizzaType, String clientName, String address){
        Long value = new Random().nextLong();
        return new Order(pizzaType,clientName,address,value);
    }

}
