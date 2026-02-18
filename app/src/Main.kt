fun main() {
    val person = Person()
    val person2 = Person()
    println("Insert your name: ")
    person.name = readLine() ?: ""
    println("Insert your age: ")
    person.age = readLine()?.toInt() ?: 0
    println("Your name is ${person.name} and you are ${person.age} years old")
    println("Insert your name: ")
    person2.name = readLine() ?: ""
    println("Insert your age: ")
    person2.age = readLine()?.toInt() ?: 0
    println("Your name is ${person2.name} and you are ${person2.age} years old")
}
