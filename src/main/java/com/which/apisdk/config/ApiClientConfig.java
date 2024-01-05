package com.which.apisdk.config;

import com.which.apisdk.client.ApiClient;
import com.which.apisdk.service.ApiService;
import com.which.apisdk.service.impl.ApiServiceImpl;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author which
 */
@Data
@Configuration
@ConfigurationProperties("com.which.client")
@ComponentScan
public class ApiClientConfig {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 秘密密钥
     */
    private String secretKey;

    /**
     * 网关
     */
    private String host;

    @Bean
    public ApiClient apiClient() {
        return new ApiClient(accessKey, secretKey);
    }

    @Bean
    public ApiService apiService() {
        ApiServiceImpl apiService = new ApiServiceImpl();
        apiService.setApiClient(new ApiClient(accessKey, secretKey));
        if (StringUtils.isNotBlank(host)) {
            apiService.setGatewayHost(host);
        }
        return apiService;
    }

}
