package org.as.devtechsolution.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * @author Aditya Srivastva on 09-06-2024
 */


@ConfigurationProperties(prefix = "accounts")
public record AccountContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
}
