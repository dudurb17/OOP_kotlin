package cats

class WorkWithCats {

  fun main() {
    val cat = Cat("Whiskers")
    println(cat.legsCount)
    println(cat.name)

    val lion = Lion(countInPride = 10)
    println(lion.legsCount)
    println(lion.countInPride)
    cat.playWithMouse()
  }
}
}
