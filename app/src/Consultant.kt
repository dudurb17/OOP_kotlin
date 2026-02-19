class Consultant(
  var name: String,
  var age: Int= 0
) {

  fun sayHello()
 {
  println("Hello, my name is $name")
  if(age > 0) {
    println("I am $age years old")
  }
 }
}