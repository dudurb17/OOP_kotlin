package corporation

class FoodCard(name: String, brand: String, price: Int, val caloric: Int) :
        ProductCard(name, brand, price) {

  val productType: ProductType = ProductType.FOOD
  override fun printProductCard() {
    super.printProductCard()
    println("Caloric: $caloric")
  }
  override fun toStringToStorageFile(): String {
    return "$name%$brand%$price%$caloric%$productType"
  }
}
