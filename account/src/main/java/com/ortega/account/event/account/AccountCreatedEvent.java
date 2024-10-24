package com.ortega.account.event.account;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountCreatedEvent implements AccountEvent {
    private String accountNumber;
    private String fistName;
    private String lastName;
    private Integer pin;
}
