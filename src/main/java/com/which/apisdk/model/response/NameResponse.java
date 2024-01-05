package com.which.apisdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author which
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NameResponse extends ResultResponse {
    private static final long serialVersionUID = 1L;
    private String name;
}
