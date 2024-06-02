package net.banking.banking_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;




    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}
