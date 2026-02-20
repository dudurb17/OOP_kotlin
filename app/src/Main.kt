import corporation.Assistant
import corporation.Consultant
import corporation.Director
import corporation.Worker

fun main() {

    val consultant = Consultant(name = "John")
    val director = Director(name = "Jane", age = 40)
    val assistant = Assistant(name = "Jim", age = 20)
    val employees = listOf<Worker>(consultant, director, assistant)
    employees.forEach { it.work() }
}
