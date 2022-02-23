package libaray

fun main() {
    //================iterator================
    Library.books.iterator().let { iterator ->
        while (iterator.hasNext()){
            print(iterator.next())
        }
    }

    //================for in loop================
    Library.books.let { books -> {
        for (book in books){
            println(book)
        }
    } }
    println()

    //================forEach loop================
    Library.books.let { books ->
        books.forEach {
            print(it)
        }
    }
    println()

    Library.books.forEach {
        print(it)
    }

    //================forEach index================
    Library.books.forEachIndexed { index, book ->  println("${index} - ${book.toString()}")

    }

}