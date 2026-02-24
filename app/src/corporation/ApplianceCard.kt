package corporation

class ApplianceCard(name: String, brand: String, price: Int, val wattage: Int) :
        ProductCard(name, brand, price) {
  val productType: ProductType = ProductType.APPLIANCE
  override fun printProductCard() {
    super.printProductCard()
    println("Wattage: $wattage")
  }
  override fun toStringToStorageFile(): String {
    return "$name%$brand%$price%$wattage%$productType"
  }
}
