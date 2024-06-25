// When a function returns a function or takes a function as an argument, it's called a higher-order function.

// *** Use the repeat() function: 

// The repeat() function is one such higher-order function. 
// The repeat() function is a concise way to express a for loop with functions.

val treatBox = {
    println("Have a treat!")
}

val trickBox = {
    println("No treats!")
}


fun trickOrTreats(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
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
    val treatFunction = trickOrTreats(false) { "$it quarters" }
    val trickFunction = trickOrTreats(true, null)

    repeat(times = 4) {  // times parameter
        treatFunction()  // trailing lamda action function iteration
    }
    trickFunction()
}