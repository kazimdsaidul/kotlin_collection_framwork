import kotlin.jvm.internal.Intrinsics

// model
open class Product(val id: Int, val name: String, val price: Double)
open class Worker(var id: Int, var name: String)
class PartTimeWorker(id: Int, name: String, val hourlyParid: Double) : Worker(id = id, name = name)
class SpecialProduct(id: Int, name: String, price: Double, discount: Double) :
    Product(id = id, name = name, price = price)

data class Receipt(val id: Int, val seller: Worker, val product: List<Product>, val isPaid: Boolean = false)

class Store(val receipts: List<Receipt>, val workers: List<Worker>)

// product create
fun bear() = Product(id = 1, name = "Bear, Light, 0.51", price = 7.5)
fun coffee() = Product(id = 2, name = "Ground coffee 1 kg", price = 500.0)
fun bread() = Product(id = 3, name = "Glute-ree bread, 1kg", price = 50.09)
fun tea() = Product(id = 4, name = "Green tea", price = 50.09)
fun teaWithGirl() = SpecialProduct(id = 4, name = "teaWithGirl", price = 100.0, discount = 10.0)


fun main() {
    val firstWorker = Worker(0, "Kazi1")
    val secondWorker = Worker(1, "workder2")
    val parttimeWorker = PartTimeWorker(1, "workder2", 10.0)

    val receipts1 = Receipt(
        id = 1, seller = firstWorker, product = listOf(coffee(), bear(), coffee(), bread(), bread(), tea(), tea()), true
    )
    val receipts2 =
        Receipt(id = 2, seller = firstWorker, product = listOf(coffee(), bear(), coffee(), bread(), bread()), true)
    val receipts3 = Receipt(
        id = 3,
        seller = firstWorker,
        product = listOf(coffee(), bear(), coffee(), bread(), bread(), teaWithGirl()),
        true
    )
    val receipts4 = Receipt(id = 4, seller = secondWorker, product = mutableListOf(teaWithGirl()), false)

    val store = Store(
        receipts = listOf(receipts1, receipts2, receipts3, receipts4),
        workers = listOf(firstWorker, secondWorker, parttimeWorker)
    )

    // products you sold.
    println(store.receipts.map { it.product }.size)
    println(store.receipts.flatMap { it.product }.size)

    // total income of day
    println("Total income: " + store.receipts.flatMap { it.product }.sumByDouble { it.price })
    println("Total paid: " + store.receipts.count { it.isPaid })


    println("Total worker: " + store.workers.map { it.id }.size)
    println("Regular worker:" + store.workers.filterIsInstance<Worker>().count())
    println("PartTimeWorker worker:" + store.workers.filterIsInstance<PartTimeWorker>().count())

    println("List of employeee who sell SpecialProduct ")
    store.receipts.map { it.product }
        .filterIsInstance<SpecialProduct>().forEach {
            println(it.name) }





}
