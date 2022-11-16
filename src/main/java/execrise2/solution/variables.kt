package execrise2.solution // ktlint-disable filename

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
