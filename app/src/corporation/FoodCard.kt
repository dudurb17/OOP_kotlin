package corporation

class FoodCard(name: String, brand: String, price: Int, val caloric: Int) :
        ProductCard(name, brand, price) {

  override fun printProductCard() {
    super.printProductCard()
    println("Caloric: $caloric")
  }
}
