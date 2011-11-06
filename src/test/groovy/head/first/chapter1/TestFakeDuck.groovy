package head.first.chapter1

import org.junit.Test

class TestFakeDuck extends GroovyTestCase {

    @Test
    void testDuckCall() {
        DuckCall duckCall = new DuckCall()
        duckCall.performQuack()
    }
}
