// write a program that calculates these age-based ticket prices:

// 1. A children's ticket price of $15 for people 12 years old or younger.
// 2. A standard ticket price of $30 for people between 13 and 60 years old. On Mondays, discount the standard ticket price to $25 for this same age group.
// 3. A senior ticket price of $20 for people 61 years old and older. Assume that the maximum age of a moviegoer is 100 years old.
// 4. A -1 value to indicate that the price is invalid when a user inputs an age outside of the age specifications.


// 1. Solve using if/else and else/if conditionals: 

// fun ticketPrice(age: Int, isMonday: Boolean): Int {
//     var price = 0

//     if (age <= 12){
//         price = 15
//     } else if (age > 12 && age <= 60){
//         if (isMonday){
//             price = 25
//         } else {
//             price = 30
//         }
//     } else if (age > 60 && age <= 100){
//         price = 20
//     }
//     else {
//         price = -1
//     }

//     return price
// }

// 2. Solve using the when and if/else expression: 

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when(age) {
        in 0..12 -> 15
        in 12..60 -> if (isMonday) 25 else 30
        in 60..100 -> 20
        else -> -1
    }
}

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}
