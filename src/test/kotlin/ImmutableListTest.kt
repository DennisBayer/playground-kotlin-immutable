import kotlinx.collections.immutable.toImmutableList
import java.lang.ClassCastException
import kotlin.test.*

class ImmutableListTest {
    @Test
    fun testImmutableNotCastable() {
        assertFailsWith(ClassCastException::class) {
            val names: List<String> = listOf("Susie", "Peter", "Ajay")
                .filter { it.length == 5 }
                .toImmutableList()
            (names as MutableList).add("Fred")
        }
    }
}
