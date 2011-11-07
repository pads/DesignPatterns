package head.first.observer

interface Subject {

    def registerObserver()

    def removeObserver()

    def notifyObservers()

}