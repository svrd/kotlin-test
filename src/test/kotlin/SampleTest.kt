import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SampleTest {
    private val testSample : Sample = Sample()
    @Test
    fun sum() {

        val expectedSum = 42
        assertEquals(expectedSum, testSample.sum(40,2))
    }
}