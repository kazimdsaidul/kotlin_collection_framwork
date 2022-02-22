
// model
data class Product(val id:Int, val name:String, val price:Double)

data class Receipt(val id:Int, val seller:Worker, val product: List<Product>, val isPaid: Boolean = false)
data class Worker(val id: Int, val name:String)

class Store(val receipts: List<Receipt>, val workers: List<Worker>)

// product create
fun bear() = Product(id = 1, name = "Bear, Light, 0.51", price = 7.5)
fun coffee() = Product(id = 2, name = "Ground coffee 1 kg", price = 500.0)
fun bread() = Product(id = 3, name = "Glute-ree bread, 1kg", price = 50.09 )
fun tea() = Product(id = 4, name = "Green tea", price = 50.09)


fun main (){
    val firstWorker = Worker(0,"Kazi")
    val secondWorker = Worker(0,"2992")

    val receipts1 = Receipt(id = 1, seller = firstWorker, product = listOf<Product>(coffee(), bear(), coffee(), bread(), bread()), true)
    val receipts2 = Receipt(id = 2, seller = firstWorker, product = listOf<Product>(coffee(), bear(), coffee(), bread(), bread()), true)
    val receipts3 = Receipt(id = 3, seller = firstWorker, product = listOf<Product>(coffee(), bear(), coffee(), bread(), bread()), true)
    val receipts4 = Receipt(id = 4, seller = secondWorker, product = listOf<Product>(coffee(), coffee(), coffee(), bread(), bread()), false)

    val store = Store(receipts = listOf(receipts1, receipts2, receipts3,receipts4 ), workers = listOf(firstWorker, secondWorker))

    // products you sold.
    println(store.receipts.map { it.product})
    println(store.receipts.flatMap { it.product })
}
