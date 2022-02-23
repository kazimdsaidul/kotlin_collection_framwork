package libaray

fun main() {
    /*
     */

    Library.books.associateBy { it.title}.forEach {
       println(it)
    }


    println("===========================================")
    val numbers = listOf("one", "two", "two","three", "four")
    println("associateWith: "+numbers.associateWith { it.length })
    println("associateBy: "+numbers.associateBy { it.length })
    println("associate: "+numbers.associate { Pair(it.length, it) })
    println("associate with first char: "+numbers.associate { Pair(it.first(), it) })


}