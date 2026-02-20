package corporation
class Accountant() {
  var option: Int = 0

  fun registerNewItem() {
    println("Enter the product type: 0 - food, 1 - appliance, 2 - shoe: ")
    val productType = readLine()?.toInt() ?: 0
    println("Enter the product name: ")
    val productName = readLine() ?: ""
    println("Enter the product brand: ")
    val productBrand = readLine() ?: ""
    println("Enter the product price: ")
    val productPrice = readLine()?.toInt() ?: 0
    var card: ProductCard = ProductCard(name = "", brand = "", price = 0)
    when (productType) {
      0 -> {
        println("Enter the caloric: ")
        val caloric = readLine()?.toInt() ?: 0
        card =
                FoodCard(
                        name = productName,
                        brand = productBrand,
                        price = productPrice,
                        caloric = caloric
                )
      }
      1 -> {
        println("Enter the wattage: ")
        val wattage = readLine()?.toInt() ?: 0
        card =
                ApplianceCard(
                        name = productName,
                        brand = productBrand,
                        price = productPrice,
                        wattage = wattage
                )
      }
      2 -> {
        println("Enter the size: ")
        val size = readLine()?.toFloat() ?: 0.0f
        card = ShoeCard(name = productName, brand = productBrand, price = productPrice, size = size)
      }
    }
    card.printProductCard()
  }

  fun main() {
    do {
      println("Enter the operation code: 0 - exit, 1 - register new item: ")
      option = readLine()?.toInt() ?: 0
      if (option == 0) {
        break
      } else {
        registerNewItem()
      }
    } while (true)
  }
}
