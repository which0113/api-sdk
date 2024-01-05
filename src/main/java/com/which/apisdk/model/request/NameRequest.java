package com.which.apisdk.model.request;

import com.which.apisdk.model.enums.RequestMethodEnum;
import com.which.apisdk.model.params.NameParams;
import com.which.apisdk.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @author which
 */
@Accessors(chain = true)
public class NameRequest extends BaseRequest<NameParams, NameResponse> {

    @Override
    public String getPath() {
        return "/name";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<NameResponse> getResponseClass() {
        return NameResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
