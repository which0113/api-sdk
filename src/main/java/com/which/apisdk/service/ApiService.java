package com.which.apisdk.service;

import cn.hutool.http.HttpResponse;
import com.which.apisdk.client.ApiClient;
import com.which.apisdk.exception.ApiException;
import com.which.apisdk.model.request.*;
import com.which.apisdk.model.response.LoveResponse;
import com.which.apisdk.model.response.PoisonousChickenSoupResponse;
import com.which.apisdk.model.response.RandomWallpaperResponse;
import com.which.apisdk.model.response.ResultResponse;

/**
 * @author which
 */
public interface ApiService {

    /**
     * 通用请求
     *
     * @param request 要求
     * @return {@link HttpResponse}
     * @throws ApiException 业务异常
     */
    <O, T extends ResultResponse> T request(BaseRequest<O, T> request) throws ApiException;

    /**
     * 通用请求
     *
     * @param apiClient api客户端
     * @param request   要求
     * @return {@link T}
     * @throws ApiException 业务异常
     */
    <O, T extends ResultResponse> T request(ApiClient apiClient, BaseRequest<O, T> request) throws ApiException;

    /**
     * 随机毒鸡汤
     *
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException;

    /**
     * 喝毒鸡汤
     *
     * @param apiClient api客户端
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup(ApiClient apiClient) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param request 要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param apiClient api客户端
     * @param request   要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(ApiClient apiClient, RandomWallpaperRequest request) throws ApiException;

    /**
     * 随意情话
     *
     * @return {@link LoveResponse}
     * @throws ApiException 业务异常
     */
    LoveResponse randomLoveTalk() throws ApiException;

    /**
     * 随意情话
     *
     * @param apiClient api客户端
     * @return {@link LoveResponse}
     * @throws ApiException 业务异常
     */
    LoveResponse randomLoveTalk(ApiClient apiClient) throws ApiException;

    /**
     * 星座运势
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse horoscope(HoroscopeRequest request) throws ApiException;

    /**
     * 星座运势
     *
     * @param apiClient api客户端
     * @param request   要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse horoscope(ApiClient apiClient, HoroscopeRequest request) throws ApiException;

    /**
     * 获取ip信息
     *
     * @param apiClient api客户端
     * @param request   要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getIpInfo(ApiClient apiClient, IpInfoRequest request) throws ApiException;

    /**
     * 获取ip信息
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getIpInfo(IpInfoRequest request) throws ApiException;

    /**
     * 获取天气信息
     *
     * @param apiClient api客户端
     * @param request   要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWeatherInfo(ApiClient apiClient, WeatherRequest request) throws ApiException;

    /**
     * 获取天气信息
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException;

    /**
     * 获取通用信息
     *
     * @param apiClient api客户端
     * @param request   请求
     * @return {@link ResultResponse }
     * @throws ApiException api异常
     */
    ResultResponse getCommonInfo(ApiClient apiClient, CommonRequest request) throws ApiException;

    /**
     * 获取通用信息
     *
     * @param request 请求
     * @return {@link ResultResponse }
     * @throws ApiException 业务异常
     */
    ResultResponse getCommonInfo(CommonRequest request) throws ApiException;

}
