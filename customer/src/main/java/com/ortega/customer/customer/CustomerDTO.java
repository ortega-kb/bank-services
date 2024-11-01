package com.ortega.customer.customer;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Builder
@Getter
@Setter
public class CustomerDTO {

    private UUID customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private Gender gender;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;

}
