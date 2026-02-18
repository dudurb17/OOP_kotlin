fun main() {
    // val person = Person()
    // val person2 = Person()
    // println("Insert your name: ")
    // person.name = readLine() ?: ""
    // println("Insert your age: ")
    // person.age = readLine()?.toInt() ?: 0
    // person.printPerson()
    // println("Insert your name: ")
    // person2.name = readLine() ?: ""
    // println("Insert your age: ")
    // person2.age = readLine()?.toInt() ?: 0
    // person2.printPerson()
    // val assistant = Assistant()
    // assistant.bringCoffee(3, "Coffee")
    var name: String 
    var brand: String 
    var size: Float 
    var price: Int 

    println("Insert the name of the product: ")
    name = readLine() ?: ""
    println("Insert the brand of the product: ")
    brand = readLine() ?: ""
    println("Insert the size of the product: ")
    size = readLine()?.toFloat() ?: 0f
    println("Insert the price of the product: ")
    price = readLine()?.toInt() ?: 0

    val productCard = ProductCard()
    productCard.init(name, brand, size, price)
    productCard.printProductCard()
}
