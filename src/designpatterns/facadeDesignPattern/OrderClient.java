package designpatterns.facadeDesignPattern;

import designpatterns.facadeDesignPattern.system.facade.OrderFacade;

public class OrderClient {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.creteOrder();
    }
}
