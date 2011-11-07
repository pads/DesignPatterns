package head.first.strategy

import org.junit.Test

class TestFakeDuck extends GroovyTestCase {

    @Test
    void testDuckCall() {
        DuckCall duckCall = new DuckCall()
        duckCall.performQuack()
    }
}
