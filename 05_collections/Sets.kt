// Sets in Kotlin : ******************

// A set is a collection that does not have a specific order and does not allow duplicate values.
// A set uses hash codes as array indices. Instead, you can think of a Set as an array of lists.

// Sets have two properties : 
// 1. Searching for a specific element in a set is fast—compared with lists—especially for large collections.
// 2. Sets tend to use more memory than lists for the same amount of data, since more array indices are often needed than the data in the set.

// The benefit of sets is ensuring uniqueness.
// to keep track of newly discovered planets, a set provides a simple way to check if a planet has already been discovered. With large amounts of data,

// there's both a Set and a MutableSet.
// MutableSet implements Set, so any class implementing MutableSet needs to implement both.

fun main() {

    // Use a "MutableSet" in kotlin :  this returns a MutableSet. 
    val solarSystems = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystems.size)
    // The default implementation of which is " LinkedHashSet() ". 

    // add() method : 
    solarSystems.add("Pluto")
    println(solarSystems.size)

    // contains() method :
    println(solarSystems.contains("Pluto")) // true
    println("Earth" in solarSystems)

    // Try adding "Pluto" again: 
    solarSystems.add("Pluto")
    println(solarSystems.size) // 9   ,, sets can't contain duplicates. 

    // "remove()" function : 
    solarSystems.remove("Pluto")
    // Remember that sets are an unordered collection. There's no way to remove a value from a set by its index, as sets don't have indices.

    println(solarSystems.contains("Pluto"))
    println(solarSystems)

}
