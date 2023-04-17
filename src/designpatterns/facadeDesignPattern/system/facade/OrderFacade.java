package designpatterns.facadeDesignPattern.system.facade;

import designpatterns.facadeDesignPattern.system.invoice.Invoice;
import designpatterns.facadeDesignPattern.system.notification.Notification;
import designpatterns.facadeDesignPattern.system.payment.Payment;
import designpatterns.facadeDesignPattern.system.product.ProductDao;

public class OrderFacade {
    ProductDao productDao;
    Payment payment;
    Invoice invoice;
    Notification notification;

    public OrderFacade() {
        this.productDao = new ProductDao();
        this.payment = new Payment();
        this.invoice = new Invoice();
        this.notification = new Notification();
    }

    public boolean creteOrder() {
        System.out.println("Started creating order.");
        this.productDao.getProduct();
        this.payment.makePayment();
        this.invoice.getInvoice();
        this.notification.sendNotification();
        System.out.println("Order completed.");
        return true;
    }
}
