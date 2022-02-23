package libaray

import kotlin.system.measureTimeMillis

fun main() {

/*  Benefits of map over for loops, This is a list of the benefits of using map as I see them:
    * True iteration — you know that your code is going to run on each element of the array in the right order.
    * Immutability — if written properly, your original array will be unaffected. This has potential benefits in cases where the original array is still needed elsewhere. for loops can of course also be written so as not to update the original array, but it requires more code and updating our new array as part of our loop operation. map keeps this cleaner since you only have to work in one scope to still maintain immutability:
    * Scope isolation and Reusability — often the function inside map only needs to work within its own scope, i.e. against the elements inside the array themselves. It doesn’t require any variables outside of its scope. A for loop may require this (such as declaring capitalizeNames outside the loop and also using it in the loop). This reduces the chances of making a mistake by updating something inappropriately in the wrong scope. This also makes it easier to extract the operation we use in map for clarity / isolation / reuse.
    * Cleaner code — I think less code is strictly better as long as the original meaning isn’t lost. When doing identical things, map can almost always be written with less code than for. It can be cleanly written on one line sometimes whereas for requires at least two — generally three with braces included. Finally, the array element you are working with for map automatically gets a name. You would have to assign this to a variable when using for if you wanted it. name is clearer than names[x]. Scope isolation and a reduction in the amount of variables you need alongside reduced size all make code objectively cleaner. It’s arguable whether the meaning of map vs. for is lost on some people, but I think the next point helps:
    * Specificity — this applies to iteration operators generally rather than just map. Each has a specific purpose. map calls a function for each element of the array and returns a new array. reduce calls a function for each element of the array and keeps the results in an accumulator whose ultimate value is returned. filter takes an array and returns a new array whose values have met some condition against the original array. Each operator has a specific purpose that is easier to reason about. for loops can be used more generally, and you have to inspect the code to determine how it’s being used in a specific case.
    * Composability — it is much easier to compose iteration operations together. For example, you could do map(map(map)) (not that you should need to), or more realistically reduce(filter(map)) . If you wanted to do something similar for for loops, you would have to manage a separate array and iteration process for all three operations and their results.
 */

    // ************************ list of all book authors name ***************************
    // ===================problem statement 1 : list of all book authors name
    Library.books.forEach {
        it.authors.forEach {
            println(it.name)
        }
    }

    println("=====================map==================================")

    val authors = Library.books.map { book ->
       book.authors.map { it.name }
    }
    println(authors)

    // ************************ list of all book authors name by comma, Authors1, Autors2, Author2 ***************************
    // ===================problem statement 1 : list of all book authors name

    val map = Library.books
        .map { book -> book.authors }.joinToString(separator = "\n") { authors ->
            authors.joinToString {
                it.name
            }
        }
    println(map)


    // book title with index 0 - Zero to one
    println("=====================book title with index Like: 1. - Zero to one==================================")

    Library.books.mapIndexed { index, book -> println("${index+1} - ${book.title}") }

}

