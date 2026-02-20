package corporation

class ApplianceCard(name: String, brand: String, price: Int, val wattage: Int) :
        ProductCard(name, brand, price) {
  override fun printProductCard() {
    super.printProductCard()
    println("Wattage: $wattage")
  }
}
