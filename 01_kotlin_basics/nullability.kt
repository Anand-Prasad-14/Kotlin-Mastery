// Use null to indicate that there's no value associated with the variable

fun main() {
    // val favoriteActor = null
    // println(favoriteActor)

    // var favoriteActor: String = "Anand"
    // favoriteActor = null // Null can not be a value of non-null type string

 // Nullable types are variables that can hold null
 // Non-null types are variables that can't hold null

    
    var number: Int? = 10
    println(number)

    number = null
    println(number)
}