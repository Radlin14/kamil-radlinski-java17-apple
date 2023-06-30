package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {

        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double calculateAverageTemperatures() {
        double temp = 0;
        for (Map.Entry<String, Double> averageTemperatures : temperatures.getTemperatures().entrySet()) {
            temp = temp +averageTemperatures.getValue();
    }
        return temp/temperatures.getTemperatures().size();
        }

        public double calculateMedianTemperatures (){
            List<Double> value = new ArrayList<>();
            for (Map.Entry<String,Double> medianTemperatures : temperatures.getTemperatures().entrySet()){
                value.add(medianTemperatures.getValue());
            }
           Collections.sort(value);
            int result = (value.size())/2;
            if(value.size()%2!=0){
                return value.get(result);
            }
           else {
               return (value.get(result) + value.get(result + 1))/2;
            }

        }

    }
