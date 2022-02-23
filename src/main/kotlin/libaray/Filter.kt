package libaray

fun main() {

    Library.books.filter{ it.price <=1000}.forEach { println(it) }
    val any = Library.books.any{
        it.genres is Genre.Fiction
    }
    println(any)

    val numbers = listOf("one", "two", "three", "four")

    println(numbers.any { it.endsWith("a") })
    println(numbers.none { it.endsWith("a") })
    println(numbers.all { it.endsWith("e") })

}