package uk.co.xenonique.learn;

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

/*
 * See here
 * https://kotlinlang.org/docs/flow.html#flows
 * https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-core/jvm/test/guide/example-flow-04.kt
 *
 */
fun simple123(): Flow<Int> = flow { // flow builder
    for (i in 1..3) {
        delay(100) // pretend we are doing something useful here
        emit(i) // emit next value
    }
}

fun main() = runBlocking<Unit> {
    // Launch a concurrent coroutine to check if the main thread is blocked
    launch {
        for (k in 1..3) {
            println("I'm not blocked $k")
            delay(100)
        }
    }
    // Collect the flow
    simple123().collect { value -> println(value) }
}
