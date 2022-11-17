### Exercise 1 :- Convert normal function to single expression function



```

fun convertToFahrenheit(degree : Float) : Float {
    return (degree * 9 / 5) + 32
}

fun main() {
    println(convertToFahrenheit(degree = 11f))
}


```

### Exercise 2 :- Convert if else statement to single expression function

```
fun getResult(percentage: Int): String {
    if (percentage > 40) {
        return "Pass"
    } else {
        return "Fail"
    }
}

fun main() {
    println(getResult(percentage = 60))
}


```
