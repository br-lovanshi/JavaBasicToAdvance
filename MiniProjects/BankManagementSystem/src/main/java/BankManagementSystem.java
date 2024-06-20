import configuration.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BankInterface;
import service.BankServiceImpl;

public class BankManagementSystem {

    public static void main(String[] args) {
//
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//
//        BankServiceImpl bankInterface  = (BankServiceImpl) ctx.getBean("BankServiceImpl");
//        bankInterface.getName();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        BankServiceImpl bankService = context.getBean(BankServiceImpl.class);
        
    }
}
