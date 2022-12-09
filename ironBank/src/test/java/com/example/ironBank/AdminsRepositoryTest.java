package com.example.ironBank;
import com.example.ironBank.models.account.Account;
import com.example.ironBank.models.account.CheckingAccount;
import com.example.ironBank.models.account.StudentChecking;
import com.example.ironBank.models.user.AccountHolders;
import com.example.ironBank.models.user.User;
import com.example.ironBank.repositories.account.AccountRepository;
import com.example.ironBank.repositories.user.AccountHoldersRepository;
import com.example.ironBank.repositories.user.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest
public class AdminsRepositoryTest {

    @Autowired
    AccountHoldersRepository accountHoldersRepository;

    @Autowired
    AccountRepository accountRepository;

    AccountHolders accountHolders1;
    AccountHolders accountHolders2;

    Account account1;
    Account account2;

    @BeforeEach
    void setUp(){
        accountHolders1=accountHoldersRepository.save(new AccountHolders("Juan", LocalDate.of(1970, 12,01), null, "juan@es.com"));
        accountHolders2=null;

        account1=accountRepository.save(new CheckingAccount(new BigDecimal(1292), 1111, accountHolders1, null, new BigDecimal(0.5), new BigDecimal(110), new BigDecimal(12)));
        account2=accountRepository.save(new StudentChecking(new BigDecimal(120), 1121, accountHolders1, null, new BigDecimal(0.5)));
    }

    @Test
    void shouldAddAccount(){
        //assertTrue
    }

    @Test
    void updateBalance_OK(){
        this.account1.getBalance();
        Assertions.assertEquals(0, this.account1.getBalance());
    }

    @Test
    void shouldDeleteAccount(){
        // assertTrue
    }
}