package com.which.apisdk.model.request;

import com.which.apisdk.model.enums.RequestMethodEnum;
import com.which.apisdk.model.response.LoveResponse;
import com.which.apisdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @author which
 */
@Accessors(chain = true)
public class LoveRequest extends BaseRequest<String, LoveResponse> {

    @Override
    public String getPath() {
        return "/loveTalk";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<LoveResponse> getResponseClass() {
        return LoveResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
