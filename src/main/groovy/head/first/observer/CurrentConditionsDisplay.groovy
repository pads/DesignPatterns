package head.first.observer

class CurrentConditionsDisplay implements Observer, DisplayElement {

    float temperature
    float humidity
    Subject weatherData

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    def update(float temperature, float humidity, float pressure) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }

    def display() {
        println "Current conditions: ${temperature}C degrees and ${humidity}%"
    }
}
