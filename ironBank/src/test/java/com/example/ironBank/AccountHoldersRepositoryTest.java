package com.example.ironBank;
import com.example.ironBank.dtos.AccountDTO;
import com.example.ironBank.models.account.Account;
import com.example.ironBank.models.account.CheckingAccount;
import com.example.ironBank.models.user.AccountHolders;
import com.example.ironBank.repositories.account.AccountRepository;
import com.example.ironBank.repositories.account.CheckingAccountRepository;
import com.example.ironBank.repositories.user.AccountHoldersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class AccountHoldersRepositoryTest {

    @Autowired
    AccountHoldersRepository accountHoldersRepository;

    @Autowired
    CheckingAccountRepository checkingAccountRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    CheckingAccount checkingAccount;

    @Autowired
    AccountDTO accountDTO;


    @BeforeEach
    void setUp(){
        //create accounts and accountHolders
    }

    @Test
    void shouldFindByAccountId(){
        AccountHolders primaryOwner = accountHoldersRepository.findById(accountDTO.getPrimaryOwnerId()).get();
        AccountHolders secondaryOwner = null;
        Account account = accountRepository.save(new CheckingAccount(new BigDecimal(1230.9), 123, null, null, new BigDecimal(2), new BigDecimal(100), new BigDecimal(12)));
        assertEquals(account.getAccountId(), checkingAccountRepository.findById(account.getId()));
    }

    void shouldTransferToOtherAccount(){
        // assertTrue
    }
}