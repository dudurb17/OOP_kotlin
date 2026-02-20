package corporation

class Assistant(name: String = "Assistant", age: Int = 0) : Worker(name, age) {
  override fun work() {
    println("Assistant is working now...")
  }
  fun bringCoffee(drinkName: String): String {
    println("Hello, You are my assistant $name")
    println("Bringing coffee")
    println("Coffee $drinkName")
    return "Coffee $drinkName"
  }
}
