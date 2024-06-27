package controller;

import model.Bank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BankInterface;
import service.BankServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BankController {

    static ApplicationContext ctx = new ClassPathXmlApplicationContext("Configuration.xml");
    public static BankInterface bankInterface = ctx.getBean("BankServiceImpl",BankServiceImpl.class);

    public static void addBank(Bank bank){
        bankInterface.addBank(bank);
        System.out.println("bank added successfully.");
    }

    public static Bank updateBank(Bank bank, Long id) throws Exception {
        bankInterface.updateBank(bank, id);
        return new Bank();
    }

    public void deleteBank(Long id) throws Exception {
        bankInterface.deleteBank(id);
        System.out.println("Bank deleted successfully.");
    }

    public Map<Long,Bank> allBanks() throws Exception {
        return bankInterface.getAllBanks();

    }

    public Bank getBankById(Long id) throws Exception {
        return bankInterface.getBank(id);
    }
}
