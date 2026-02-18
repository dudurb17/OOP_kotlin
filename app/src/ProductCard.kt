class ProductCard {
  var name: String = ""
  var brand: String = ""
  var size: Float = 0f
  var price: Int = 0

  fun init( name: String, brand: String, size: Float, price: Int) {
    this.name = name
    this.brand = brand
    this.size = size
    this.price = price
  }

  fun printProductCard() {
    println("Name: $name")
    println("Brand: $brand")
    println("Size: $size")
    println("Price: $price")
  }

}