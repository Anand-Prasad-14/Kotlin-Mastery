// Handle nullable variables

fun main() {
    // val favoriteActor: String = "Anand Bhai" // non-nullable variable
    var favoriteActor: String? = "Anand Bhai" // nullable variable

    // println(favoriteActor.length) // ERROR: Only safe or non-null asserted calls are allowed on nullable type string?
    
    // " Use ?. safe call operator "" to access the property of the nullable type string and return the value of the property value 
    // as a string instead of an empty string when the property is null 
    println(favoriteActor?.length)

    // !! not-null assertion operator // ******
    // value of the variable isn't null
    println(favoriteActor!!.length)

    favoriteActor = null
    println(favoriteActor?.length) // safe call expression simply returns null
    // println(favoriteActor!!.length) /* ERROR: NullPointerException */

    // Use the if/else conditionals
    if (favoriteActor!= null) {
        println("favorite actor is : ${favoriteActor.length}")
    } else {
        println("No favorite actor")
    }

    // convert a nullable variable to a non-nullable variable
    var superHero: String? = "Spiderman"
    val lengthOfName = if(superHero != null) { // You can also use the == camparision operator for null checks.
        superHero.length
    } else {
        0
    }
    println("The super hero is: $lengthOfName ")


    //Use the ?: Elvis operator
    // you can add default value when the ?. safe call operator returns null
    val lengthOfName2 = superHero?.length ?: 0
    println("The super hero is: $lengthOfName2 ")
}