package uk.co.xenonique.learn

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import org.amshove.kluent.*

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach


class AsynchronousFlowTest {

    @Test
    fun `asynchronous with suspend function`() {
        suspend fun simpleDelayList(): List<Int> {
            delay(1000) // pretend we are doing something asynchronous here
            return listOf(1, 2, 3)
        }

        runBlocking<Unit> {
            simpleDelayList().forEach { value -> println(value) }
        }
    }

    @Test
    fun `asynchronous with Flow`() {
        fun simple(): Flow<Int> = flow { // flow builder
            for (i in 1..3) {
                delay(100) // pretend we are doing something useful here
                emit(i) // emit next value
            }
        }

        runBlocking<Unit> {
            // Launch a concurrent coroutine to check if the main thread is blocked
            launch {
                for (k in 1..3) {
                    println("I'm not blocked $k")
                    delay(100)
                }
            }
            // Collect the flow
            simple().collect { value -> println(value) }
        }
    }
}

