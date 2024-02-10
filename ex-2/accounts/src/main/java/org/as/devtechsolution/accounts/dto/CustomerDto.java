package org.as.devtechsolution.accounts.dto;

import lombok.Data;

/**
 * @author Aditya Srivastva on 04-02-2024
 */

@Data
public class CustomerDto {
    private String name;

    private String email;

    private String mobileNumber;

    private AccountsDto accountsDto;
}
