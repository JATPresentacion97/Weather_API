package com.example.weather;

import com.example.weather.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WeatherApplicationTests {

	@Autowired
	private WeatherService weatherService;

	@Test
	void contextLoads() {
		// Add assertions to check that the weatherService bean is properly loaded
		assert(weatherService != null);
	}
}
