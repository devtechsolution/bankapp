package org.as.devtechsolution.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Aditya Srivastva on 04-02-2024
 */

@Data @AllArgsConstructor
public class ResponseDto {
    private String statusCode;
    private String statusMsg;
}
