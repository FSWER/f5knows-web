package com.f5knows.web.index.controller.weather;


import com.f5knows.export.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Resource
    private WeatherService weatherService;

    @GetMapping("/getByLocation")
    public String getWeatherByLocation(){
        return weatherService.getWeather();
    }

}
