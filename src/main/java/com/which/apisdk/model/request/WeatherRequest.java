package com.which.apisdk.model.request;

import com.which.apisdk.model.enums.RequestMethodEnum;
import com.which.apisdk.model.params.WeatherParams;
import com.which.apisdk.model.response.NameResponse;
import com.which.apisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @author which
 */
@Accessors(chain = true)
public class WeatherRequest extends BaseRequest<WeatherParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/weather";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
