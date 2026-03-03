package corporation

class FoodCard(name: String, brand: String, price: Int, val caloric: Int) :
        ProductCard(name, brand, price) {

  val productType: ProductType = ProductType.FOOD
  override fun printProductCard() {
    println("Name: $name, Brand: $brand, Price: $price, Caloric: $caloric")
  }
  override fun toStringToStorageFile(): String {
    return "$name%$brand%$price%$caloric%$productType"
  }
}
