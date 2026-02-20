package corporation

import kotlin.random.Random

class Consultant(name: String, age: Int = 0) : Worker(name, age) {
  override fun work() {
    println("Consultant is working now...")
  }

  fun sayHello() {
    println("Hello, my name is $name")
    if (age > 0) {
      println("I am $age years old")
    }
  }

  fun serveCustomers() {
    val count = Random.nextInt(0, 100)
    repeat(count) { println("The customer is served...") }
  }
}
