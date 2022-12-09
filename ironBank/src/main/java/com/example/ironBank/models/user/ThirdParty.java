package com.example.ironBank.models.user;
import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

@Entity
@Table (name = "third_party_user")
public class ThirdParty {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long thirdPartyId;

    private String hashedKey;

    private String name;


    public ThirdParty() {
    }

    public ThirdParty(String hashedKey, String name) {
        this.hashedKey = hashedKey;
        this.name = name;
    }

    public Long getThirdPartyId() {
        return thirdPartyId;
    }

    public void setThirdPartyId(Long thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
    }

    public String getHashedKey() {
        return hashedKey;
    }

    public void setHashedKey(String hashedKey) {
        this.hashedKey = hashedKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}