# Learn You An Coroutines Kotlin For The Greater Good


Fluent Assertion-Library for Kotlin
https://markusamshove.github.io/Kluent/Exceptions.html

## Coroutines

  * [Coroutines Guide](https://kotlinlang.org/docs/coroutines-guide.html#additional-references)
  * [Coroutine basics](https://kotlinlang.org/docs/coroutines-basics.html)
  * [Cancellation and Timeout](https://kotlinlang.org/docs/cancellation-and-timeouts.html)
  * [Composing and Suspending Functions](https://kotlinlang.org/docs/composing-suspending-functions.html)
  * [Coroutine context and dispatchers](https://kotlinlang.org/docs/coroutine-context-and-dispatchers.html#asynchronous-timeout-and-resources)
  * [Coroutine asynchronous flows](https://kotlinlang.org/docs/flow.html#flows)

Stack trace

```
Exception in thread "main" java.lang.ClassCastException: class uk.co.xenonique.learn.Demo_flows_01Kt$main$1$2 cannot be cast to class kotlinx.coroutines.flow.FlowCollector (uk.co.xenonique.learn.Demo_flows_01Kt$main$1$2 and kotlinx.coroutines.flow.FlowCollector are in unnamed module of loader 'app')
	at uk.co.xenonique.learn.Demo_flows_01Kt$main$1.invokeSuspend(demo-flows-01.kt:28)
	at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33)
	at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:106)
	at kotlinx.coroutines.EventLoopImplBase.processNextEvent(EventLoop.common.kt:284)
	at kotlinx.coroutines.BlockingCoroutine.joinBlocking(Builders.kt:85)
	at kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking(Builders.kt:59)
	at kotlinx.coroutines.BuildersKt.runBlocking(Unknown Source)
	at kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(Builders.kt:38)
	at kotlinx.coroutines.BuildersKt.runBlocking$default(Unknown Source)
	at uk.co.xenonique.learn.Demo_flows_01Kt.main(demo-flows-01.kt:19)
	at uk.co.xenonique.learn.Demo_flows_01Kt.main(demo-flows-01.kt)
```

Runtime classpath inside Intellij IDEA 2022.1.4

```
Gradle API files
org.jetbrains.kotlin:kotlin-bom:1.5.31
org.jetbrains.kotlin:kotlin-reflect:1.6.10
org.jetbrains.kotlin:kotlin-stdlib-common:1.6.21
org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.6.21 (*)
org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.21
org.jetbrains.kotlin:kotlin-stdlib:1.6.21
org.jetbrains.kotlin:kotlin-reflect:1.6.10 (*)
org.jetbrains.kotlin:kotlin-stdlib:1.6.21 (*)
org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4
```


October 2022


+PP+
