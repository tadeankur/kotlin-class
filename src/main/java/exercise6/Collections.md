### Exercise 1 :- Define list and print collection


1. Creates a MutableList.
2. Adds a new item to the MutableList.
3. Retrieves the size of the read-only list.
4. Iterates the list and prints its elements.
```
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3) // 1

fun main() {
    systemUsers.add(4) // 5
    println("Total sudoers: ${systemUsers.size}") // 6
    systemUsers.forEach { // 7
            it ->
        println("Some useful info on user $it")
    }
    // 8
}
```

### Exercise 2 :- Define a Map and iterate throught it

```
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)

fun main() {
    EZPassAccounts.forEach { // 5
            k, v ->
        println("ID $k: credit $v")
    }
}

```
### Exercise 3 :- Filter


```
val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1

val positives = numbers.filter { x -> x > 0 }  // 2

val negatives = numbers.filter { it < 0 }      // 3
```

### Exercise 4:- Map

map extension function enables you to apply a transformation to all elements in a collection. It takes a transformer function as a lambda-parameter.

```
val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1

val doubled = numbers.map { x -> x * 2 }      // 2

val tripled = numbers.map { it * 3 }          // 3
```

### Exercise 5: Function any
Function any returns true if the collection contains at least one element that matches the given predicate.

```
val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
val anyNegative = numbers.any { it < 0 }             // 2
val anyGT6 = numbers.any { it > 6 }                  // 3
```
### Exercise 6: Function all

Function all returns true if all elements in collection match the given predicate.

```
val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

val allEven = numbers.all { it % 2 == 0 }            // 2

val allLess6 = numbers.all { it < 6 }                // 3
```
### Exercise 7: groupBy
1. Defines a data class that describes a person.
2. Defines a collection of people.
3. Builds a map that contains cities and people living there. The values of the map are lists of person names.
4. Print the values of map 
```
data class Person(val name: String, val city: String, val phone: String) // 1

val people = listOf(                                                     // 2
    Person("John", "Boston", "+1-888-123456"),
    Person("Sarah", "Munich", "+49-777-789123"),
    Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
    Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"))

val peopleCities = people.groupBy(Person::city, Person::name)            // 3
 // exercise to stundent

```
### Exercise 8: Fold and reduce
reduce() and fold() that apply the provided operation to the collection elements sequentially and return the accumulated result.
The operation takes two arguments:the previously accumulated value and the collection element.

reduce() uses the first and the second elements as operation arguments on the first step.
```
val numbers = listOf(5, 2, 10, 4)

val simpleSum = numbers.reduce { sum, element -> sum + element }
println(simpleSum)
```

fold() takes an initial value and uses it as the accumulated value on the first step,
```
val numbers = listOf(5, 2, 10, 4)
val sumDoubledRight = numbers.fold(0) { element, sum -> sum + element * 2 }
println(sumDoubledRight)
```

### Execrise 9 (Optional): 
Solve the exercise mentioned in class NonRepeatingCharacterFinder.kt


