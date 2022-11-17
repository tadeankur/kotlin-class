Create a new kotlin file as NullSafe.kt

### Exercise 1

1. Declares a non-null String variable.
2. When trying to assign null to non-nullable variable, a compilation error is produced.

```
var neverNull: String = "This can't be null"            // 1
neverNull = null 
```

### Exercise 2

1. Declares a nullable String variable.
2. Sets the null value to the nullable variable. This is OK.

```
  var nullable: String? = "You can keep a null here"      // 3
  nullable = null  
```

### Exercise 3

####Safe calls

Your second option for accessing a property on a nullable variable is using the safe call operator ?.

```
val a = "Kotlin"
val b: String? = null
println(b?.length)
println(a?.length) // Unnecessary safe call
```


### Exercise 4

Convert following code to elvis operator

```
fun main() {
    val probablePartRef: String? = "12345"
    val partReflength = if (probablePartRef != null) probablePartRef.length else -1
    println(partReflength)
}
```
Make probablePartRef = null and try to see the output.