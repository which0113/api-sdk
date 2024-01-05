package com.which.apisdk.model.request;

import com.which.apisdk.model.enums.RequestMethodEnum;
import com.which.apisdk.model.params.PoisonousChickenSoupParams;
import com.which.apisdk.model.response.PoisonousChickenSoupResponse;
import lombok.experimental.Accessors;

/**
 * @author which
 */
@Accessors(chain = true)
public class PoisonousChickenSoupRequest extends BaseRequest<PoisonousChickenSoupParams, PoisonousChickenSoupResponse> {

    @Override
    public String getPath() {
        return "/poisonousChickenSoup";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link PoisonousChickenSoupResponse}>
     */
    @Override
    public Class<PoisonousChickenSoupResponse> getResponseClass() {
        return PoisonousChickenSoupResponse.class;
    }

    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
