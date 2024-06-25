// You can store functions in variables, pass them to functions, and return them from functions.
// EX.: Nest composable functions to build layouts.

// Store a function in a variable: 

fun main() {
    
    // We want to store the function in a variable, not call the function.
    // val trickFunction = trick // ERROR: Function invocation 'trick()' expected
   
    // val trickFunction = ::trick     // To refer to the function as a value, reassign trickFunction to ::trick

    val singFunction = sing // function as a value.

    //Function call
    sing()
    singFunction()
    treat()
    trick()

    val trickFunction = trickOrTreat(false)
    val treatFunction = trickOrTreat(true)
    trickFunction()
    treatFunction()
    

    // Pass a function as an argument
    val coins: (Int) -> String = { quantity  -> 
        "$quantity quarters"
    }
    
    val cupcake: (Int) -> String = {  
        "Have a cupcake!"
    }

    val extraTreatFunction = extraTrickOrTrick(false, coins) 
    val extraTrickFunction = extraTrickOrTrick(false, cupcake)
    extraTreatFunction()
    extraTrickFunction()

    val notNullFunction = nullableTrickOrTreat(false, coins)
    val nullFunction = nullableTrickOrTreat(true, null) 
    notNullFunction()
    nullFunction()
}



// fun trick() {
//     println("No treats!")
// }

// Define function with a lambda expresion:

// Store a lambda expression directly in a variable without a function reference(::) and "fun" keyword

val sing = {   // The return type is ` () -> Unit ` because function doesn't return anything.
    println("Hello World!")
}

// Use functions as a data type

// val treat: () -> Unit = {
//     println("Have a treat!")
// }

val treat = {
    println("Have a treat!")
}

val trick = {
    println("No treats!")
}


// Use a function as a return type:

fun trickOrTreat(isTrick: Boolean): () -> Unit {
    if (isTrick) {
        return trick      // returns trick() function
    } else {
        return treat      // returns treat() function
    }
}

// Pass a funtion to another function as an argument:

fun extraTrickOrTrick(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        println(extraTreat(5))
        return treat
    }
}

// Nullable function types:

//function types can be declared as nullable by using "?" symbol outside the ending parenthesis.
fun nullableTrickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}