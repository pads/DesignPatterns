package head.first.observer

final class WeatherData implements Subject {

    float temperature
    float humidity
    float pressure

    def observers = []

    def registerObserver(Observer observer) {
        observers.add(observer)
    }

    def removeObserver(Observer observer) {
        observers.remove(observer)
    }

    def notifyObservers() {
        observers.each {
            it.update(temperature, humidity, pressure)
        }
    }

    def measurementsChanged() {
        notifyObservers()
    }

    def setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}
