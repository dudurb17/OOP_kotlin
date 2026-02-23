package corporation
class Accountant(name: String, age: Int = 0) : Worker(name, age) {

  override fun work() {
    val productTypes = ProductType.entries
    print("Enter the product type: ")
    productTypes.forEach { print("${it.ordinal} - ${it.title}"); if(it.ordinal == productTypes.size - 1) println(":"); else print(", "); }
    val productTypeIndex = readLine()?.toInt() ?: 0
    val productType: ProductType = productTypes[productTypeIndex]
    println("Enter the product name: ")
    val productName = readLine() ?: ""
    println("Enter the product brand: ")
    val productBrand = readLine() ?: ""
    println("Enter the product price: ")
    val productPrice = readLine()?.toInt() ?: 0
    var card: ProductCard = ProductCard(name = "", brand = "", price = 0)
    when (productType) {
      ProductType.FOOD -> {
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
      ProductType.APPLIANCE -> {
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
      ProductType.SHOE -> {
        println("Enter the size: ")
        val size = readLine()?.toFloat() ?: 0.0f
        card = ShoeCard(name = productName, brand = productBrand, price = productPrice, size = size)
      }
    }
    card.printProductCard()
  }

  fun main() {
    val operationCodes = OperationCode.entries
    do {
      print("Enter the operation codße: ")
      operationCodes.forEach { print("${it.ordinal} - ${it.title}"); if(it.ordinal == operationCodes.size - 1) println(":"); else print(", "); }
      val optionIndex = readLine()?.toInt() ?: 0
      val operationCode: OperationCode = operationCodes[optionIndex]
      when (operationCode) {
        OperationCode.EXIT -> break
        OperationCode.REGISTER_NEW_ITEM -> work()
        OperationCode.DELETE_ITEM -> break
      }
    } while (true)
  }
}
