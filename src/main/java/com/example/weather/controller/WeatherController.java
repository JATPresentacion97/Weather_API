package com.example.weather.controller;

import com.example.weather.model.WeatherResponse;
import com.example.weather.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather/{city}")
    public WeatherResponse getWeather(@PathVariable String city) {
        return weatherService.getWeatherByCity(city);
    }
}
