class Assistant {
  fun bringCoffee(coffeeCount: Int, drinkName: String)
  { 
    repeat(coffeeCount) {
      println("Bringing coffee")
      println("Coffee $it")
      println("Take coffee")
      println("Bring coffee to the office")
      println("Sit down")
      println("Drink $drinkName")
      println("Enjoy your coffee")
    }
  }
}