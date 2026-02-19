class Assistant (var name: String = "Assistant"){
  fun bringCoffee( drinkName: String): String
  { 
      println("Hello, You are my assistant $name")
      println("Bringing coffee")
      println("Coffee $drinkName")
      return "Coffee $drinkName"
  }
}