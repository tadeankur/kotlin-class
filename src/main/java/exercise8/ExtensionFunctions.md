### Exercise 1 :- Write extension function

Write extension function that will prepare a list  of all the names of the items.

1. Defines simple models of Item and Order. Order can contain a collection of Item objects.
2. Adds extension functions for the Order type.
3. Calls extension functions directly on an instance of Order.

```

data class Item(val name: String, val price: Float) // 1

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemName() = items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

fun main() {
    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    println("Max priced item name: ${order.maxPricedItemName()}") // 4
}

```
