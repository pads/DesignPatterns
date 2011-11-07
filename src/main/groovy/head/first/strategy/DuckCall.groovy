package head.first.strategy

class DuckCall {

    QuackBehaviour quackBehaviour

    public DuckCall() {
        quackBehaviour = new Quack()
    }

    def performQuack() {
        quackBehaviour.quack()
    }

}
