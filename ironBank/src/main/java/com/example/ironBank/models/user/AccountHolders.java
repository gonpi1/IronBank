package com.example.ironBank.models.user;
import com.example.ironBank.models.account.Account;
import com.example.ironBank.models.user.Address;
import com.example.ironBank.models.user.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AccountHolders extends User {
    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate dateOfBirth;

    @Embedded
    Address primaryAddress;
    //@Embedded
    /* @AttributeOverrides({
             @AttributeOverride(name = "address", column = @Column(name = "physical_address"))
     },
             @AttributeOverride(name = "postalCode", column = @Column(name = "physical_postal_code")),
             @AttributeOverride(name = "city", column = @Column(name = "physical_city")),
             @AttributeOverride(name = "country", column = @Column(name = "physical_country"))
        }) */

    private String mailingAddress;

    @OneToMany(mappedBy = "primaryOwner")
    private List<Account> accountListPrimaryOwner = new ArrayList<>();

    @OneToMany(mappedBy = "secondaryOwner")
    private List<Account> accountListSecondaryOwner = new ArrayList<>();

    public AccountHolders() {
    }

    public AccountHolders(String name, LocalDate dateOfBirth, Address primaryAddress, String mailingAddress) {
        super (name);
        this.dateOfBirth = dateOfBirth;
        this.primaryAddress = primaryAddress;
        this.mailingAddress = mailingAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(Address primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }
}