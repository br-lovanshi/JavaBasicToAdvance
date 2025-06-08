package solidPrinciple.SOLID;

class MessageService{
    void sendMsg(String type){
        if("SMS".equalsIgnoreCase(type)){
            System.out.println("SMS sending...");
        } else if ("Email".equalsIgnoreCase(type)) {
            System.out.println("Email sending...");
        }
    }
}

interface Notifier{
    void send();
}

class SMS implements Notifier{

    @Override
    public void send() {
        System.out.println("SMS sending...");
    }
}

class Email implements Notifier{

    @Override
    public void send() {
        System.out.println("Email sending...");
    }
}

class NotificationService{
    private Notifier notifier;
    NotificationService(Notifier notifier){
        this.notifier = notifier;
    }

    void send(){
        notifier.send();
    }
}

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new SMS());
        notificationService.send();
    }
}
