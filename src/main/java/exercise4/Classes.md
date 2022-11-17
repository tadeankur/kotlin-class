Create a new kotlin file as ClassesInKotlin.kt


### Exercise 1

1. Declare a class.
2. create a object in main method.

```
class Contact(val id: Int, var email: String)

fun main() {

    val contact = Contact(1, "mary@gmail.com")  // 4

    println(contact.id)                         // 5
    contact.email = "jane@gmail.com"            // 6
}

```

### Exercise 2

By default, all the classes are final in kotlin 

1.  Create a base class for inheritance 
2.  Create a derived class which is inhertied from base class and override the method

```
  open class Dog {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}
```

### Exercise 3

####Default values for constructor

A class constructor proprties can have default values

Define a class with default values and try to initialize object without default value and try to see the output

```
class Person(val firstName: String, val lastName: String, var isEmployed: Boolean = true)
```

You have interface and abstract classes having same behaviour as Java