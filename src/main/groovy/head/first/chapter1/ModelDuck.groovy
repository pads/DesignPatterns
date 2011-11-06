package head.first.chapter1

class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay()
        quackBehaviour = new Quack()
    }

    def display() {
        println "I'm a model duck"
    }
}
