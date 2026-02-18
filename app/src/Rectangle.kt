class Rectangle {
 var width: Int 
 var height: Int 

 constructor(): this(0) 

 constructor(width: Int, height: Int) {
  this.width = width
  this.height = height
 }

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