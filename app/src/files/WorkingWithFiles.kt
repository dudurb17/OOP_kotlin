package files

import corporation.ProductCard
import java.io.File

class WorkingWithFiles {

  fun createListOfCards(cards: List<ProductCard>) {
    val file = File("todo_list.txt")
    cards.forEach { file.appendText("Name: ${it.name}, Brand: ${it.brand}, Price: ${it.price}\n") }
  }

  fun readListOfCards() {
    val file = File("todo_list.txt")
    file.readText().forEach { print(it) }
  }

  fun main() {
    val file = File("test.txt")
    file.writeText("Hello, World!")
    println(file.readText())
  }
}
