package head.first.observer

class StatisticsDisplay implements Observer, DisplayElement {

    def temperatures = []
    Subject weatherData

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    def update(float temperature, float humidity, float pressure) {
        temperatures.add(temperature)
        display()
    }

    def display() {
        println "Average/Max/Minimum temperatures:" +
                   "${temperatures.sum()/temperatures.size()}/${temperatures.max()}/${temperatures.min()}"
    }
}
