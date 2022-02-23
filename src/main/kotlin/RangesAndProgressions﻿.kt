import sun.misc.Version

fun main() {

//    for (i in 1..10){
//        println(i)
//    }
    //================================================
//    val i = 5
//    if (i in 1..4) {
//        print(i)
//    }

    //===================================================
//    var i = 0
//    for ( i in 10 downTo 1  ) println(i)

    //===================================================
//    for (i in 1..8 step 2) println(i)

    //===================================================

//    for (i in 1 until 10) println(i)
    //===================================================


//    val versionRant = MyVersion(1, 11)..MyVersion(1, 9)
//    println(MyVersion(0,9) in versionRant)
//
//    val range1_100 : IntRange = 0.rangeTo(100)
//    val range1_50 : IntRange = 0..50
//
//    val progression: IntProgression = 0..100 step 100

    //====================================================
    val number = setOf(1,null,3)
    println(number.mapNotNull { it })




}

class MyVersion(private val major: Int, private val minor: Int): Comparable<MyVersion> {

    override fun compareTo(other: MyVersion): Int {
        if (this.major != other.major){
            return this.major - other.major
        }
        return this.major - other.minor
    }

}
