package com.example.weather.service;

import com.example.weather.model.WeatherResponse;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final String apiKey = "YOUR_OPENWEATHERMAP_API_KEY";
    private final String apiUrl = "https://api.openweathermap.org/data/2.5/weather";
    private final RestTemplate restTemplate = new RestTemplate();

    @Cacheable(value = "weatherCache", key = "#city")
    public WeatherResponse getWeatherByCity(String city) {
        String url = String.format("%s?q=%s&appid=%s&units=metric", apiUrl, city, apiKey);
        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}
