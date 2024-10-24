package com.ortega.account.event.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
public class CustomerCreatedEvent implements CustomerEvent {
    private UUID customerId;
    private String firstName;
    private String lastName;
}
