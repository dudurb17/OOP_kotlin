package corporation

class Director(name: String, age: Int = 0) : Worker(name, age) {
  override fun work() {
    println("Director is working now...")
  }
  fun takeCoffee(assistant: Assistant) {
    val drinkName: String = assistant.bringCoffee(drinkName = "Coffee")
    println("Director ${assistant.name} is taking coffee: $drinkName")
  }

  fun getConsultantToWork(consultant: Consultant) {
    val count = consultant.serveCustomers()
    println("Director ${consultant.name} is getting consultant to work $count customers")
  }
}
