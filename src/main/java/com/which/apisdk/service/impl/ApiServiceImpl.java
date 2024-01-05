package com.which.apisdk.service.impl;

import com.which.apisdk.client.ApiClient;
import com.which.apisdk.exception.ApiException;
import com.which.apisdk.model.request.*;
import com.which.apisdk.model.response.LoveResponse;
import com.which.apisdk.model.response.PoisonousChickenSoupResponse;
import com.which.apisdk.model.response.RandomWallpaperResponse;
import com.which.apisdk.model.response.ResultResponse;
import com.which.apisdk.service.ApiService;
import com.which.apisdk.service.BaseService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author which
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(request);
    }

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup(ApiClient apiClient) throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(apiClient, request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(ApiClient apiClient, RandomWallpaperRequest request) throws ApiException {
        return request(apiClient, request);
    }

    @Override
    public LoveResponse randomLoveTalk() throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(request);
    }

    @Override
    public LoveResponse randomLoveTalk(ApiClient apiClient) throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(apiClient, request);
    }

    @Override
    public ResultResponse horoscope(HoroscopeRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse horoscope(ApiClient apiClient, HoroscopeRequest request) throws ApiException {
        return request(apiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(ApiClient apiClient, IpInfoRequest request) throws ApiException {
        return request(apiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(IpInfoRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse getWeatherInfo(ApiClient apiClient, WeatherRequest request) throws ApiException {
        return request(apiClient, request);
    }

    @Override
    public ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException {
        return request(request);
    }
}
