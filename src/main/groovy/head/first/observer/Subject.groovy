package head.first.observer

interface Subject {

    def registerObserver(Observer observer)

    def removeObserver(Observer observer)

    def notifyObservers()

}