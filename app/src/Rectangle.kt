class Rectangle (var width: Int = 0, var height: Int = 0) {

 constructor(size: Int): this(size, size) 

 fun printRectangle() {
  println("Width: $width")
  println("Height: $height")
 }

 fun draw() {
  repeat(height) {
    repeat(width) {
      print("*")
    }
    println()
  }
 }
}