# Immutable list example

This example shows the usage of [org.jetbrains.kotlinx:kotlinx-collections-immutable](https://github.com/Kotlin/kotlinx.collections.immutable).

In order to proof the concept of an immutable list just run the test which expects to fail with an class cast
exception.

```shell script
playground-kotlin-immutable$ ./gradlew test
> Task :compileKotlin
> Task :compileJava NO-SOURCE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE
> Task :compileTestKotlin
> Task :compileTestJava NO-SOURCE
> Task :processTestResources NO-SOURCE
> Task :testClasses UP-TO-DATE

> Task :test

ImmutableListTest > testImmutableNotCastable PASSED

BUILD SUCCESSFUL in 2s
3 actionable tasks: 3 executed
```

The main class should fail:

```shell script
playground-kotlin-immutable$ ./gradlew run
> Task :compileKotlin UP-TO-DATE
> Task :compileJava NO-SOURCE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE

> Task :run FAILED
names (1) = [Susie, Peter]
Exception in thread "main" java.lang.ClassCastException: kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector cannot be cast to kotlin.collect
ions.MutableList
       at MainKt.main(Main.kt:9)
       at MainKt.main(Main.kt)
```
