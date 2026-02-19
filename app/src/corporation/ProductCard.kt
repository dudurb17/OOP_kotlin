package corporation
class ProductCard(var name: String, var brand: String, var size: Float, var price: Int) {

  // fun init( name: String, brand: String, size: Float, price: Int) {
  //   this.name = name
  //   this.brand = brand
  //   this.size = size
  //   this.price = price
  // }

  fun printProductCard() {
    println("Name: $name")
    println("Brand: $brand")
    println("Size: $size")
    println("Price: $price")
  }
}
