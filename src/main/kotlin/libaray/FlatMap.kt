package libaray

// when to user flatMap --------------list inside of list than > return a  singla list..


fun main() {
    Library.books.flatMap { it.authors }
        .map{  it.name}
        .toSet()
        .forEach { println(it) }



}