package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(name ="Accounts", description = "Schema To hold Account Information")
public class AccountsDTO {
    @Schema(description = "Account Number of the Customer", example = "1234567890")
    @NotEmpty(message = "AccountNumber can not be a null or empty")
    @Pattern(regexp="(^$|[0-9]{10})",message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @Schema(description = "Account Type of the Customer", example = "Savings")
    @NotEmpty(message = "AccountType can not be a null or empty")
    private String accountType;

    @Schema(description = "Branch Address of the Customer", example = "1234 Main St")
    @NotEmpty(message = "BranchAddress can not be a null or empty")
    private String branchAddress;
}
