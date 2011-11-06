package head.first.chapter1

import org.junit.Test

class TestDuck extends GroovyTestCase {

    @Test
    void testMallardDuck() {
        Duck mallard = new MallardDuck()
        mallard.performQuack()
        mallard.startFlying()
    }

}
