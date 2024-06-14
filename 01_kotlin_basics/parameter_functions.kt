// Add a parameter to the function

fun main(){
    println(birthdayGreeting("Anand"))
    println(birthdayGreeting("Elisha"))

    println(detailsInfo("Samson", 40))
    println(detailsInfo(name = "Dallaila", age = 38)) // Named Arguments 
}
fun birthdayGreeting(name: String): String { // add name parameter
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 23 years old!"
    return "$nameGreeting\n$ageGreeting"
}

//  fun personDetails(name: String, age: Int) // Function Signature
// fun birthdayGreeting(name: String = "Rover", age: Int) // Default Arguments for name value

fun detailsInfo(name: String, age: Int): String { // add multiple parameter
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

