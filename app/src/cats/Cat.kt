package cats

class Cat(var name: String) : CatsFamily() {

  fun playWithMouse() {
    println("I'm playing with mouse")
  }
}
