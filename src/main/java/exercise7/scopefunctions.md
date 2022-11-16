### Exercise 1 :- Define list and print collection

“let” operator provides an option to perform an operation on the current object and return any value based on the use case.

```
fun main() {
    val person = Person().let {
        return@let "The name of the Person is: ${it.name}"
    }
    print(person)
}

class Person {
    val name: String = "Jon"
}

```

### Exercise 2 :- Avoid null check


```
 var name: String? = "abcd"
fun main() {
    val name = name?.let {
        "The name of the Person is: $it"
    }.orEmpty()
    print(name)
}

```