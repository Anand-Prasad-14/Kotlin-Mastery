// Maps collections in kotlin : *******************

// A map is a collection of keys and values.
// It's called map because unique keys are mapped to other values.
// Two different keys could map to the same value. For example, "Mercury" has 0 moons, and "Venus"
// has 0 moons.
// Accessing a value from a map by its key is generally faster than searching through a large list,
// such as with indexOf().

// Maps declaration :

// Maps require two generic types -> one for keys and another for the values
// A map can also use type inference if it has initial values.

fun main() {

    // Maps declaration :

    // Maps require two generic types -> one for keys and another for the values
    // A map can also use type inference if it has initial values.
    // Use the mutableMapOf() method : 
    val planets = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    println(planets.size)

    // Insert the element to map : 
    planets["Pluto"] = 5
    println(planets.size)

    // Print the number of moons for the key "Pluto" to get a value. 
    println(planets["Pluto"])

    // Access values with the get() method, if there isn't a key-value pair, it will return null. 
    println(planets.get("Theia"))
    
    // The remove() method removes the key-value pair with the specified key. 
    planets.remove("Theia")
    println(planets.get("Theia")) // To verify that the items was removed

    // modify a value for a key : 
    planets["Earth"] = 2
    println(planets["Earth"])
    
    // Use the put() method to update a value for a key.
    planets.put("Jupiter", 78)

    // Iterate over a map : 
    for ((key, value) in planets) {
        println("$key has $value moons")
    }
    
    // Use the keys() or values() methods to get a collection of keys or values respectively.   
    println(planets.keys)
    println(planets.values)
    
    // Use the containsKey() or containsValue() methods to check if a key or value exists in the map.   
    println(planets.containsKey("Earth"))
    println(planets.containsValue(2))

    // Use the clear() method to remove all elements from the map.   
    planets.clear()
    println(planets.isEmpty())

}


// Note : Arrays and lists provide fast access to elements by their index, while sets and maps use hash codes to make it easier to find elements in the collection.
//        Maps work similarly to sets and store pairs of keys and values of the specified type.