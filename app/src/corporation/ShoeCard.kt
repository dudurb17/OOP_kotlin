package corporation

class ShoeCard(name: String, brand: String, price: Int, val size: Float) :
        ProductCard(name, brand, price) {
  override fun printProductCard() {
    super.printProductCard()
    println("Size: $size ")
  }
}
