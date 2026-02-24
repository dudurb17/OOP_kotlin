package corporation

class ShoeCard(name: String, brand: String, price: Int, val size: Float) :
        ProductCard(name, brand, price) {
  val productType: ProductType = ProductType.SHOE
  override fun printProductCard() {
    super.printProductCard()
    println("Size: $size ")
  }
  override fun toStringToStorageFile(): String {
    return "$name%$brand%$price%$size%$productType"
  }
}
