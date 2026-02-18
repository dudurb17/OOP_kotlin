fun main() {
    val person = Person()
    val person2 = Person()
    println("Insert your name: ")
    person.name = readLine() ?: ""
    println("Insert your age: ")
    person.age = readLine()?.toInt() ?: 0
    person.printPerson()
    println("Insert your name: ")
    person2.name = readLine() ?: ""
    println("Insert your age: ")
    person2.age = readLine()?.toInt() ?: 0
    person2.printPerson()
}
