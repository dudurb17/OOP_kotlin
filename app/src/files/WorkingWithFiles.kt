package files

import corporation.ApplianceCard
import corporation.FoodCard
import corporation.ProductCard
import corporation.ProductType
import corporation.ShoeCard
import java.io.File

class WorkingWithFiles {

        fun createListOfCards(cards: List<ProductCard>) {
                val file = File("src/files/storage/product_list.txt")
                cards.forEach { file.appendText("${it.toStringToStorageFile()}\n") }
        }

        fun readListOfCards(): MutableList<ProductCard> {
                var cards = mutableListOf<ProductCard>()
                val file = File("src/files/storage/product_list.txt")
                val lines = file.readText().trim().split("\n")
                lines.forEach({
                        val productType: ProductType =
                                ProductType.valueOf(it.split("%").last().toString())
                        when (productType) {
                                ProductType.FOOD -> {
                                        cards.add(
                                                FoodCard(
                                                        name = it.split("%")[0],
                                                        brand = it.split("%")[1],
                                                        price = it.split("%")[2].toInt(),
                                                        caloric = it.split("%")[3].toInt()
                                                )
                                        )
                                }
                                ProductType.APPLIANCE -> {
                                        cards.add(
                                                ApplianceCard(
                                                        name = it.split("%")[0],
                                                        brand = it.split("%")[1],
                                                        price = it.split("%")[2].toInt(),
                                                        wattage = it.split("%")[3].toInt()
                                                )
                                        )
                                }
                                ProductType.SHOE -> {
                                        cards.add(
                                                ShoeCard(
                                                        name = it.split("%")[0],
                                                        brand = it.split("%")[1],
                                                        price = it.split("%")[2].toInt(),
                                                        size = it.split("%")[3].toFloat()
                                                )
                                        )
                                }
                        }
                })
                return cards
        }

        fun main() {
                val file = File("test.txt")
                file.writeText("Hello, World!")
                println(file.readText())
        }
}
