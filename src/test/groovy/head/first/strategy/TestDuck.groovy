package head.first.strategy

import org.junit.After
import org.junit.Test

class TestDuck extends GroovyTestCase {

    Duck duck

    @After
    void tearDown() {
        duck.display()
    }

    @Test
    void testMallardDuck() {
        duck = new MallardDuck()
        duck.performQuack()
        duck.startFlying()
    }

    @Test
    void testModelDuck() {
        duck = new ModelDuck()
        duck.performQuack()
        duck.startFlying()
        duck.setFlyBehaviour(new FlyRocketPowered())
        duck.startFlying()
    }

}
