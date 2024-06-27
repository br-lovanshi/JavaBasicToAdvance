package service;

import model.Bank;

import java.util.Map;

public interface BankInterface {

    public boolean addBank(Bank bank);
    public Bank getBank(Long id) throws Exception;
    public boolean updateBank(Bank bank,Long id) throws Exception;
    public boolean deleteBank(Long id)throws Exception;
    public Map<Long,Bank> getAllBanks() throws Exception;

}
