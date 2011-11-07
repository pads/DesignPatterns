package head.first.observer

import org.junit.Test

class TestWeatherStation extends GroovyTestCase {

    @Test
    void testWeatherStation() {
        WeatherData weatherData = new WeatherData()

        DisplayElement currentConditionsDisplay = new CurrentConditionsDisplay(weatherData)
        DisplayElement statisticsDisplay = new StatisticsDisplay(weatherData)
        DisplayElement forecastDisplay = new ForecastDisplay(weatherData)

        weatherData.setMeasurements(30, 75, 30.4)
        weatherData.setMeasurements(25, 60, 24.6)
        weatherData.setMeasurements(22, 55, 22.1)
    }

}
