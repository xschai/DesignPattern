package com.chai.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDate implements Subject{
    private List<Observer> observers;
    private WeatherDetail weatherDetail;

    public WeatherDate(){
        observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!observers.isEmpty()) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(weatherDetail);
        }
    }

    public void setMeasurements(WeatherDetail weatherDetail){
        this.weatherDetail = weatherDetail;
        notifyObserver();
    }
}
