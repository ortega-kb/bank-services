package com.ortega.account.account;

import org.springframework.stereotype.Component;

@Component
public class AccountMapper {

    public Account toAccount(AccountRequest request) {
        if (request == null) return null;

        return Account.builder()
                .accountId(request.accountId())
                .accountNumber(request.accountNumber())
                .customerId(request.customerId())
                .balance(request.balance())
                .status(request.status())
                .build();
    }

    public AccountDTO toDTO(Account account) {
        if (account == null) return null;

        return AccountDTO.builder()
                .accountId(account.getAccountId())
                .accountNumber(account.getAccountNumber())
                .customerId(account.getCustomerId())
                .balance(account.getBalance())
                .status(account.getStatus())
                .build();
    }
}
