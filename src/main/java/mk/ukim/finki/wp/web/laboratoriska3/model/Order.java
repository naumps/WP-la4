package mk.ukim.finki.wp.web.laboratoriska3.model;


public class Order {
    public String pizzaType;
    public String clientName;
    public String clientAddress;
    public Long orderId;

    public Order(String pt,String cn,String ca,Long id){
        this.pizzaType = pt;
        this.clientName = cn;
        this.clientAddress = ca;
        this.orderId = id;
    }
}
