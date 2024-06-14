//The Kotlin compiler uses main() function as a starting point of program.
fun main(){
    birthdayGreeting() // Call function
    messageSend()
    val inviting = onAction() // store the return value
    println(inviting)
}

// Definition of functions
fun birthdayGreeting(){ // Default return type is Unit
    println("Happy Birthday, Krish!")
    println("You are now 50 years old!")
}

// Return a value from a function
 
fun messageSend(): Unit { // Unit means the function doesn't return a value
    println("Don't fear, New kingdom is coming!")
}

fun onAction(): String { // it will return string value
    val goal = "Jaddu, will return!"
    val save = "SAVE THE WORLD FROM THE DESTROYER"
    return "$goal\n$save"
}