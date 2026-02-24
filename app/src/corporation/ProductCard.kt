package corporation
open class ProductCard(var name: String, var brand: String, var price: Int) {

  open fun printProductCard() {
    println("Name: $name")
    println("Brand: $brand")
    println("Price: $price")
  }

  open fun toStringToStorageFile(): String {
    return "$name%$brand%$price"
  }
}
