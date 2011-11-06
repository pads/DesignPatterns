package head.first.chapter1

class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings()
        quackBehaviour = new Quack()
    }

    def display() {
        println "I'm a real Mallard duck"
    }

}
