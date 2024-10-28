package com.ortega.account.account;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.UUID;

public record AccountRequest(
        @NotNull(message = "Customer id is required")
        UUID customerId
) {
}
