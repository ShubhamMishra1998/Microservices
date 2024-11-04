package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(name = "ErrorResponse", description = "Schema to hold the error response")
@Data
@AllArgsConstructor
public class ErrorResponseDTO {
    @Schema(description = "API Path", example = "/accounts/create")
    private  String apiPath;
    @Schema(description = "Error Code", example = "500")
    private HttpStatus errorCode;
    @Schema(description = "Error Message", example = "Internal Server Error")
    private  String errorMessage;
    @Schema(description = "Error Time", example = "2022-12-12T12:12:12.123456Z")
    private LocalDateTime errorTime;
}
