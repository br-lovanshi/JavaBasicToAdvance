package service;

import database.DataStore;
import model.Bank;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Service
public class BankServiceImpl implements BankInterface {

    public Map<Long, Bank> bankdata = DataStore.bankData;
    @Override
    public boolean addBank(Bank bank) {
        bankdata.put(bank.getId(),bank);
        return true;
    }

    @Override
    public Bank getBank(Long id) throws Exception {
        Bank bank = bankdata.get(id);
        if(bank == null) throw new Exception("Bank not found.");
        return bank;
    }

    @Override
    public boolean updateBank(Bank bank, Long id)throws Exception {
        Bank bank1 = bankdata.replace(id,bank);
        if(bank1 == null) throw new Exception("Bank not found.");
        return true;
    }

    @Override
    public boolean deleteBank(Long id)throws Exception {
        Bank bank = bankdata.remove(id);
        if(bank == null) throw new Exception("Bank not found.");
        return true;
    }

    @Override
    public Map<Long,Bank> getAllBanks() throws Exception {
        if(bankdata.isEmpty()) throw new Exception("Bank not found.");
        return bankdata;
    }
}
