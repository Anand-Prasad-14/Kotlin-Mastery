// Use collections in kotlin :

// Collection types(sometimes called data structure) let you store multiple values,
// typically of the same data type, in an organized way.
// A collection might be an ordered list, grouping of unique values or mapping of values of one data
// type values to another.

// 1. Arrays in Kotlin : **************************

// an array is a sequence (collection of data) of values that all have the same data type.
// The elements in an array are ordered and are accessed with an index, which means that each value
// in the array has a unique position, or index
// What's an index? An index is a whole number that corresponds to an element in the array.
// An index tells the distance of an item from the starting element in an array. This is called
// zero-indexing and so on.

// properties :
// In memory , elements in the array are stored next to each other
// Accessing an array element by its index is fast and arrays have random access to each element in
// the same amount of time.
// An array has a fixed size. This mean that you can't modify the array beyond this size.

// To declare an array , use the arrayOf() function :

// The arrayOf() function takes the array elements as parameters, and returns an array of the type
// matching the parameters passed in.

val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
val gasPlanets = arrayOf("Jupitar", "Saturn", "Uranus", "Neptune")

// Create a new array by combining two diferent arrays :

val solarSystem = rockPlanets + gasPlanets

// Accessing an array element : Use subscript syntax -> solarSystem[index]

fun main() {
    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

    // Modifying values on the solarSystem array :
    solarSystem[3] = "Little Earth"
    println(solarSystem[3])

    // Scientists made a discovery that there's a ninth planet beyond Neptune called Pluto.
    // Earlier, we mentioned that you can't resize an array.
    // Add pluto at index 8 as this is 9th element in the array.

    solarSystem[8] = "Pluto" // I t throws an " ArrayIndexOutOfBounds " exception.
    println(solarSystem[8]) // You can't add more elements to an array beyond its fixed size

    // You can use the plus operator (+) to add an element to an array.
    // This will create a new array with the old elements and the new element added.

    val addSolarSystem = solarSystem + "Pluto"
    println(addSolarSystem[8])

    // If you want to make an array larger than it already is, you need to create a new array.
    val newSolarSystem =
            arrayOf(
                    "Mercury",
                    "Venus",
                    "Earth",
                    "Mars",
                    "Jupiter",
                    "Saturn",
                    "Uranus",
                    "Neptune",
                    "Pluto"
            )
    println(newSolarSystem[8])


    // Iterare over an array :
    for (planet in newSolarSystem) {
        println(planet)
    }
}

// RAM -> refers to the short-term Random Access Memory, it allows for fast access to any arbitary location in memory.
