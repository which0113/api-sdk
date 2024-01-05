package com.which.apisdk.model.request;

import com.which.apisdk.model.enums.RequestMethodEnum;
import com.which.apisdk.model.params.RandomWallpaperParams;
import com.which.apisdk.model.response.RandomWallpaperResponse;
import com.which.apisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @author which
 */
@Accessors(chain = true)
public class RandomWallpaperRequest extends BaseRequest<RandomWallpaperParams, RandomWallpaperResponse> {
    @Override
    public String getPath() {
        return "/randomWallpaper";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link ResultResponse}>
     */
    @Override
    public Class<RandomWallpaperResponse> getResponseClass() {
        return RandomWallpaperResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
