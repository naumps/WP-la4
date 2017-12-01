package mk.ukim.finki.wp.web.laboratoriska3.service.impl;

import mk.ukim.finki.wp.web.laboratoriska3.service.PizzaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PizzaServiceImpl implements PizzaService {
    @Override
    public List<String> getPizzaTypes(){
        return Stream.of("Small","Medium","Large").collect(Collectors.toList());
    }

}
