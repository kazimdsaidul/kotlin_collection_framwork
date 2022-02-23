package libaray

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val (match, rest) = numbers.partition { it.length > 3 }

    println(match)
    println(rest)

    println("====================================")
    val givenList = mutableListOf(1, 2, 3, 4, 5, 6, 7, -8, -9, -10, -11, 12, 13, 14)
//    val givenList = emptyList<Int>()
    val (positiveList, negativeList) = givenList.partition { it > 0 }

    println(positiveList)
    println(negativeList)
}