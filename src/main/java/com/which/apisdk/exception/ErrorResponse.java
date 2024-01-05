package com.which.apisdk.exception;

import lombok.Data;

/**
 * @author which
 */
@Data
public class ErrorResponse {
    private String message;
    private int code;
}
