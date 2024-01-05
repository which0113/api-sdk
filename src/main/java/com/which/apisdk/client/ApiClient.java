package com.which.apisdk.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * api客户端
 *
 * @author which
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiClient {

    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 密钥
     */
    private String secretKey;

}
