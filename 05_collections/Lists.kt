// 2. List in Kotlin ****************

// A list is an ordered, resizable collection, typically implemented as a resizable array. 
// When the array is filled to capacity and try to insert a new element, the array is copied to a new bigger array. 

// With a list, you can also insert new elements between other elements at a specific index.
// but behind the scenes, it's just an array that gets swapped out for a new array when needed.

// In collection types :
// A class that implements the "List" interface for all the properties and methods of the List interface. The same is true for "MutableList". 

// ***List*** is an interface that defines properties and methods related to a read-only ordered collection of items.
// ***MutableList*** extends the List interface by defining methods to modify a list, such as adding and removing elements.
// It's up to the class that extends them to determine how each property and method is implemented.


fun main() {

    // The "listOf()" function takes the item as parameters but returns a "List" rather than an array. 
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)   // List has a size property

    // Access element from a list : 
    // Subscript syntax [] and the get() method take an Int as a parameter and return the element at that index.
    println(solarSystem[2])
    println(solarSystem.get(3))  

    //  The indexOf() method searches the list for a given element (passed in as an argument), and returns the index of the first occurrence of that element. 
    // If the element doesn't occur in the list, it returns -1.
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))   // Output -> -1

    // Iterate over list elements using "for" loop : 
    for (planet in solarSystem) {
        println(planet)
    }
    // The variable before the "in" keyword isn't declared with val or var --- it's assumed to be get-only. 
    // This wiil be used as a temprary variable corresponding to the current element in the collection. 

    // Add elements to a list: 

    // Use "mutableListOf()" function, instead of listOf(), when creating a list you wish to add and remove elements in the collections. 
    val planetSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    planetSystem.add("Pluto") // add() has a single parameter and adds it to the end of the list. 
    println(planetSystem)

    planetSystem.add(3, "Theia")  // add() has a two parameter , index and element
    println(planetSystem)

    // Update elements at a specific index : 
    planetSystem[3] = "Future Moon"
    println(planetSystem[3])
    println(planetSystem[9])
    println(planetSystem)

    // Remove elements from a list : 
    planetSystem.remove("Future Moon")  // 1. Elements are removed using the "remove()" method. 
    planetSystem.removeAt(8)            // 2. Remove elements by its index using "removeAt()"

    // contains() method that returns a boolean if an element exists in a list. 
    println(planetSystem.contains("Pluto"))
    println("Future Moon" in planetSystem) // Use the "in" operator to check if contains the element. 

}