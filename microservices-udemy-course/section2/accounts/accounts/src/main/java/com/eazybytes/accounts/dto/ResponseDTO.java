package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(name = "Response", description = "Schema to hold successful response")
@AllArgsConstructor
@Data
public class ResponseDTO {
    @Schema(description = "Status Code of the Response")
    private String statusCode;
    @Schema(description = "Status Message of the Response", example = "Request processed successfully")
    private String statusMsg;
}
