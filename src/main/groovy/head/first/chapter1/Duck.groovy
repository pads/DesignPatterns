package head.first.chapter1

class Duck {

    FlyBehaviour flyBehaviour
    QuackBehaviour quackBehaviour

    def startFlying() {
        flyBehaviour.fly()
    }

    def performQuack() {
        quackBehaviour.quack()
    }

    def display() {}

    def swim() {
        println 'Swimming'
    }
}
