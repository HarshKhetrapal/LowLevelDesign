package designpatterns.facadeDesignPattern.system.notification;

public class Notification {
    public boolean sendNotification() {
        System.out.println("->Sending out the notification.");
        return true;
    }
}
