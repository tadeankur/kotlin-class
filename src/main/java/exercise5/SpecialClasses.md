Create a new kotlin file as SpecialClasses.kt


### Exercise 1 :- Create a data class

Defines a data class with the data modifier.
Override the default equals method by declaring users equal if they have the same id.
Method toString is auto-generated, which makes println output look nice.
Our custom equals considers two instances equal if their ids are equal.
Data class instances with exactly matching attributes have the same hashCode.
Auto-generated copy function makes it easy to create a new instance.
copy creates a new instance, so the object and its copy have distinct references.
When copying, you can change values of certain properties. copy accepts arguments in the same order as the class constructor.
Use copy with named arguments to change the value despite of the properties order.
Auto-generated componentN functions let you get the values of properties in the order of declaration

```
data class User(val name: String, val id: Int)
fun main() {
    val user = User("Alex", 1)
    println(user.name) // 3

    // provide equals function
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}") // 4
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode()) // 5
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy()) // 6
    println("Reference check ${user === user.copy()}") // 7
    println(user.copy("Max")) // 8
    println(user.copy(id = 4)) // 9

    println("name = ${user.component1()}") // 10
    println("id = ${user.component2()}")
}

```

### Exercise 2 Companion Objects

Corresponding to static in java.

1. Defines a class.
2. Defines a companion. Its name can be omitted.
3. Defines a companion object method.
4. Calls the companion object method via the class name.

```
  class BigBen {                                  //1 
    companion object Bonger {                   //2
        fun getBongs(nTimes: Int) {             //3
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(12)                         //4
}
```

