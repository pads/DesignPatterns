package head.first.strategy

abstract class Duck {

    FlyBehaviour flyBehaviour
    QuackBehaviour quackBehaviour

    def startFlying() {
        flyBehaviour.fly()
    }

    def performQuack() {
        quackBehaviour.quack()
    }

    def abstract display()

    def swim() {
        println 'All ducks float, even decoys!'
    }
}
