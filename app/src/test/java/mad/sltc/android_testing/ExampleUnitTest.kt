package mad.sltc.android_testing

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {

    var calculator = Calculator();
    @Test
    fun additionIsSuccess() {
        assertEquals(4.0, calculator.addFunction(2.0, 2.0),2.0)
    }

    @Test
    fun divideIsSuccess() {
        assertEquals(2.0, calculator.divFunction(4.0, 2.0),2.0)
    }

    @Test
    fun multiplicationIsSuccess(){
        assertEquals(50.0, calculator.multiFunction(10.0, 5.0),2.0)
    }

    @Test
    fun substractionIsSucces(){
        assertEquals(5.0, calculator.substactFunction(10.0, 5.0),2.0)
    }

    @Test
    fun stringIsSuccess(){
        assertEquals("Answer is 5.0", calculator.output(5.0));
    }

    @Test
    fun objectIsSuccess(){
        val bobFromApi = Employee("Bob", 18, "#123")
        val bobFromDb = Employee("Bobby", 18, "#123")
        assertNotSame(bobFromApi,bobFromDb);
    }
}