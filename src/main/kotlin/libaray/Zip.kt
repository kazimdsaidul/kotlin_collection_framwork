package libaray

fun main() {
    /*
    *
    *
    *
    *
    * */


    val listNumber = listOf(1, 2,3, 4,5)
    val listChar = listOf("A", "B","C", "D","E", "F", "G")
    listChar.zip(listNumber).forEach {
        println("First: "+it.first + " Second: "+it.second)
    }

    println("================================================")
    listNumber.zip(listChar).forEach {
        println("First: "+it.first + " Second: "+it.second)
    }

    println("================================================")

    listNumber.zip(listChar).forEach {
        println("First: "+it.first + " Second: "+it.second)
    }
}