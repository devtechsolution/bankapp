package org.as.devtechsolution.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
