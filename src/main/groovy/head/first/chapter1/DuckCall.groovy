package head.first.chapter1

class DuckCall {

    QuackBehaviour quackBehaviour

    public DuckCall() {
        quackBehaviour = new Quack()
    }

    def performQuack() {
        quackBehaviour.quack()
    }

}
