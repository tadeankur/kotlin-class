package execrise2.solution // ktlint-disable filename

class Contact(val id: Int, var email: String)

fun main() {

    val contact = Contact(1, "mary@gmail.com")  // 4

    println(contact.id)                         // 5
    contact.email = "jane@gmail.com"            // 6
}