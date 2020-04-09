import kotlinx.collections.immutable.toImmutableList

fun main() {
    val names: List<String> = listOf("Susie", "Peter", "Ajay")
        .filter { it.length == 5 }
        .toImmutableList()
    println("names (1) = $names")

    (names as MutableList).add("Fred")

    println("names (2) = $names")
}
