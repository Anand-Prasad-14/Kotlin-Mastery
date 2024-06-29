// What is generic data type ?

// When you want a property to have differing data types, subclassing(inheritance) is not the answer. 
// Instead , Kotlin provides something called generic types that allow you to have a single property 
// that can have differing data types that can be used with its properties and methods.

// EXAMPLE: Quiz application
// Quiz questions also need to represent the answer. 
// However, different question types—such as true or false—may need to represent the answer using a different data type.

// A generic data type is provided when instantiating a class, so it needs to be defined as part of the class signature.
// The data type that the generic type uses is passed as a parameter in angle brackets when you instantiate the class.
// Every time you add a new type of question, you have to add an answer property. 
// The only difference is the data type of the answer property.


class Question<T>(           // Generic data type
    val questionText: String,
    val answer: T,              
    val difficulty: String
)
// The answer should be of type T because its data type is specified when instantiating the Question class.


// Use an enum class :::*****************************

// You defined a difficulty property with three possible values: "easy", "medium", and "hard". While this works, there are a couple of problems.

// An enum class is used to create types with a limited set of possible values.
// EXAMPLE : cardinal directions have only  --- north, south, east, west
// Each value of an enum is called enum constant.

// Use an enum constant , instead of a string, to represent difficulty.

enum class Difficulty {
    EASY, MEDIUM, HARD
}

class Questions<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty  // enum constant
)



// Data class :::********************************

// Classes like the Question class, only contain data. They don't have any methods that perform an action. 
// These can be defined as a data class. Defining a class as a data class allows the Kotlin compiler to make certain assumptions, and to automatically implement some methods.
// For example, toString() is called behind the scenes by the println() function. 

data class QuestionMark<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
// data class methods :
// 1. equals()
// 2. hashCode()
// 3. toString
// 4. copy()

// Note: A data class needs to have at least one parameter in its constructor, and all constructor parameters must be marked with val or var.
//  A data class also cannot be abstract, open, sealed, or inner.



fun main() {

    // Generic type
    val q1 = Question("What is kotlin ....", "Programming Language", "medium")
    val q2 = Question("The sky is green. True or false", false, "easy")
    val q3 = Question("How many days in per weeks?", 7, "hard")


    // enum class
    val question1 = Questions<String>("what is java", "Programming Language", Difficulty.MEDIUM)
    val question2 = Questions<Boolean>("The sun is black. True or false", false, Difficulty.EASY)
    val question3 = Questions<Int>("Cricket Team xi player ? ", 11, Difficulty.HARD)
    println(question1.toString())   // output : Questions@37f8bb67 (object identifier)
   
    
}


