package com.chai.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<WeatherDetail> forecastDetail = new ArrayList<>();
        forecastDetail.add(new WeatherDetail(23.0, 0.9, 1.1, null));
        forecastDetail.add(new WeatherDetail(17.0, 0.5, 1.3, null));
        WeatherDetail weatherDetail = new WeatherDetail(22.0, 0.8, 1.2, forecastDetail);
        WeatherDate weatherDate=new WeatherDate();

        DisplayElement current = new CurrentConditionDisplay(weatherDate);
        DisplayElement forecast = new ForecastConditionDisplay(weatherDate);
        weatherDate.setMeasurements(weatherDetail);

        current.display();
        forecast.display();
    }
}
