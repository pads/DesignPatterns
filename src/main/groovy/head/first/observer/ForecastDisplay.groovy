package head.first.observer

class ForecastDisplay implements Observer, DisplayElement {

    Subject weatherData

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    def update(float temperature, float humidity, float pressure) {
        display()
    }

    def display() {
        println "Forcast: Who cares? It's usually wrong"
    }


}
