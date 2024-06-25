// Lambda expression with shorthand syntax


val treats = {
    println("Have a treat!")
}

val tricks = {
    println("No treats!")
}


fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return tricks
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treats
    }
}

fun main() {
    // Omit parameter name , if function has a single parameter and don't provide a name,
    // kotlin implicitly assigns it the "it" name, also omit the -> symbol , which makes concise lambda expression.

    val coins: (Int) -> String = {
        "$it quarters"             // Kotlin recognizes the it parameter
    }

    val cupcake: (Int) -> String = {  
        "Have a cupcake!"
    }

    val treatFunction = trickOrTreat(false, coins)
    treatFunction()
    val trickFunction = trickOrTreat(true, cupcake)
    trickFunction()


    // Pass a lambda expression directly into a function
    val directlyTreatFunction = trickOrTreat(false, {"$it quarters"})
    val directlyTrickFunction = trickOrTreat(true, null)
    directlyTreatFunction()
    directlyTrickFunction()


    //Use a trailing lambda syntax

    //The composable functions that you used to declare your UI take functions as parameters 
    // and are typically called using trailing lambda syntax.

    val trailTreatFunction = trickOrTreat(false) { "$it quarters" }
    trailTreatFunction()


}