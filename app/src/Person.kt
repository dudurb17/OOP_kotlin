import kotlin.random.Random

class Person(var name: String, var age: Int = 0) {
  fun serveCustomers() {
    val count = Random.nextInt(0, 100)
    repeat(count) { println("The customer is served...") }
  }
  fun printPerson() {
    println("Your name is $name and you are $age years old")
  }
}
