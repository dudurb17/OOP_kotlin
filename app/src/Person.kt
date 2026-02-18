class Person {
  var name: String = ""
  var age: Int = 0

  fun init(name: String, age: Int) {
    this.name = name
    this.age = age
  }

  fun printPerson() {
    println("Your name is $name and you are $age years old")
  }
}