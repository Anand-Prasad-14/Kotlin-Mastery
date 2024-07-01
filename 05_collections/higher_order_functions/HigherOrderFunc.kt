// Higher-order functions, which are functions that take other functions as parameter and/or return
// a function, such as repeat().

// Higher-order functions are especially relevent to collections as they help you perform common
// tasks, like sorting or filtering , with less code.

// 1. forEach() and string templates with lambdas : ************************

// A list representing a bakery's cookie menu, and use higher-order functions to format the menu.

class Cookie(
    val name: String, 
    val softBaked: Boolean, 
    val hasFilling: Boolean, 
    val price: Double
)

val cookies = listOf(              // The type is inferred to be List<Cookie>.
                Cookie(
                        name = "Chocolate Chip",
                        softBaked = false,
                        hasFilling = false,
                        price = 1.69
                ),
                Cookie(
                    name = "Banana Walnut", 
                    softBaked = true, 
                    hasFilling = false, 
                    price = 1.49
                ),
                Cookie(
                    name = "Vanilla Creme", 
                    softBaked = false, 
                    hasFilling = true, 
                    price = 1.58
                ),
                Cookie(
                        name = "Chocolate Peanut Butter",
                        softBaked = false,
                        hasFilling = true,
                        price = 1.49
                ),
                Cookie(
                    name = "Snickerdoodle", 
                    softBaked = true, 
                    hasFilling = false, 
                    price = 1.39
                ),
                Cookie(
                    name = "Blueberry Tart", 
                    softBaked = true, 
                    hasFilling = true, 
                    price = 1.79
                ),
                Cookie(
                        name = "Sugar and Sprinkles",
                        softBaked = false,
                        hasFilling = false,
                        price = 1.39
                )
        )

// Loop over a list with forEach() : 

// The forEach() function executes the function passed as parameter once for each item in the collection. 
// " forEach(action: (T) -> Unit)" , it takes a single action parameter--- a function of type (T) -> Unit . 
// " T " corresponds to whatever data type the collections contains. 



fun main() {
    
    // Call forEach() on the cookies list, using trailing lambda syntax. Because the trailing lambda is the only argument. 
    cookies.forEach {
        // println("Menu item: $it")  // it will print the unique identifier for the object, but not the contents of the object.

        // println("Menu item: $it.name")  // The value of the name property isn't accessed

        // Embed expressions in strings : 
        // " ${ expression } " , To access properties and embed them in a string. 
        // The lambda expression is placed between the curly braces {} and return value of the lambda is inserted into the string. 

        println("Menu item: ${it.name}")
    }



// 2. map() : **********************************

    // The map() function lets you transform a collection into a new collection with the same number of elements.
    // Ex-: map() could transform a List<Cookie> into a List<String> only containing the cookie's name, 
    // provided you tell the map() function how to create a String from each Cookie item.

    // Create a new variable called " fullMenu ", and set it equal to the result of calling "map()" on the "cookies" list :  

    // In the lambda's body, add a string formatted to include the name and price of it.
    val fullMenu = cookies.map { 
        "${it.name} - $${it.price}"
     }

    // The fullMenu collection returned from map() has type List<String> rather than List<Cookie>. 
    // Each Cookie in cookies corresponds to a String in fullMenu.
    println("Full menu: ")
    fullMenu.forEach {  // fullmenu list
        println(it)
    }



// 3. filter() : *******************************

    // The filter() function lets you create a subset of a collection. 
    // For example, if you had a list of numbers, you could use filter() to create a new list that only contains numbers divisible by 2.

    // Unlike map(), the resulting collection also has the same data type, so filtering a List<Cookie> will result in another List<Cookie>.

    // For each item in the collection:

    // If the result of the lambda expression is true, then the item is included in the new collection.
    // If the result is false, the item is not included in the new collection.

    // the bakery wants to highlight its soft-baked cookies in a separate section of the menu.
    // You can first filter() the cookies list, before printing the items.

    // In the lambda's body, add a boolean expression to check if the cookie's softBaked property is equal to true. 
    // Because softBaked is a Boolean itself, the lambda body only needs to contain it.softBaked.
    val softBakedMenu = cookies.filter { 
        it.softBaked
     }

    // Print the contents of softBakedMenu using forEach() : 
    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - ${it.price}")
    }

    



// 4.groupBy() : ****************************

    // The groupBy() function can be used to turn a list into a map, based on a function.
    // Each unique return value of the function becomes a key in the resulting map.
    // The values for each key are all the items in the collection that produced that unique return value.

    // he data type of the keys is the same as the return type of the function passed into groupBy().
    // The data type of the values is a list of items from the original list.

    // Ex-:  a photos app that groups photos by the subject or location where they were taken. 
   
    // For our bakery menu, let's group the menu by whether or not a cookie is soft baked.

    // Call groupBy() on the cookies list : 
    val groupedMenu = cookies.groupBy { 
        it.softBaked                    // return type will be Map<Boolean, List<Cookie>>
     }
    
     // Use emplyList(), creates an empty list -> more readable
    val softBakedList = groupedMenu[true] ?: listOf()  // containing the value of groupedMenu[true]
    val crunchyMenu = groupedMenu[false] ?: listOf() // containing the value of groupedMenu[false]

    println("Soft cookies:")
    softBakedList.forEach {
        println("${it.name} - $${it.price}")
    }
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    // Use partition(), to split a list in two



// 5. fold() : *****************************

    // The fold() function is used to generate a single value from a collection. 
    // EX -: calculating a total price or summing all the element in a list to find an average. 

    // the lambda expression is called for each element in a collection, so you can use fold() as a concise way to sum all the elements.

    // Use fold() to calculate the total price of all the cookies : 
    val totalPrice = cookies.fold(0.0) { total, cookie ->          // Use total for the accumulator
        total + cookie.price             // This is inferred to be the return value and is passed in for total the next time lambda is called. 
    }
    println("Total price: $${totalPrice}")



// 6. sortedBy() : ******************************

    // sort() function could be used to sort the elements. However, this won't work on a collection of Cookie objects.
    // Because The cookie class has several properties and kotlin won't konw which properties(name, price) you want to sort by. 

    // Kotlin collections provide a sortedBy() function. 
    // Ex- : sort by "price", the lambda would return "it.price" 
    // it will be sorted just like a collection of that type. 

    // Use sortedBy(), to sort the list of coookies alphabetically : 
    val sortedMenu = cookies.sortedBy { 
        it.name
     }
     // In the lambda expression , return "it.name". The resulting list will still be type of type "List<Cookie>",but sorted based on the name.  
    
    println("Sorted Menu: ")
    sortedMenu.forEach {
        println(it.name)
    }
}


// NOTE :  

// 1. Kotlin collections also have a sort() function if the data type has a naatural sort order. 
// 2. The fold() function in kotlin works the same as the reduce() function found in Javascript, Swift, Python, etc. 
// 3. Kotlin also has its own reduce(), where accumulator starts with the first element in the collection, rather than an initial value passed as an argument. 
// 4. Kotlin collections also have a sum() function for numeric types, as well as a higher-order sumOf() function. 


