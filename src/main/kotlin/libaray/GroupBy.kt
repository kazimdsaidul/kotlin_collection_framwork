package libaray

fun main() {
    println("===========================================")
    val numbers = listOf("one", "two", "two","three", "four")

    println("groupBy "+numbers.groupBy { it.length})



}