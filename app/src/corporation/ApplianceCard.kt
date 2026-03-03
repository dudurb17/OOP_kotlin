package corporation

class ApplianceCard(name: String, brand: String, price: Int, val wattage: Int) :
        ProductCard(name, brand, price) {
  val productType: ProductType = ProductType.APPLIANCE
  override fun printProductCard() {
    println("Name: $name, Brand: $brand, Price: $price, Wattage: $wattage")
  }
  override fun toStringToStorageFile(): String {
    return "$name%$brand%$price%$wattage%$productType"
  }
}
