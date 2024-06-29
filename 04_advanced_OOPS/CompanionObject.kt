

import Quiz// Declare objects as companion objects
import kotlin.io.println

// A companion object allows you to access its properties and methods from inside the class,
// if the object's properties and methods belong to that class, allowing for more concise syntax.

// Create a new class called Quiz to store the quiz questions, 
// and make StudentProgress a companion object of the Quiz class.

class Quiz {
    val question1 = QuestionAsk<String>("what is java", "Programming Language", Level.MEDIUM)
    val question2 = QuestionAsk<Boolean>("The sun is black. True or false", false, Level.EASY)
    val question3 = QuestionAsk<Int>("Cricket Team xi player ? ", 11, Level.HARD)
    
    companion object StudentProgress {    // Use "companion" Keyword, to declare objects as companion objects
        var total: Int = 10
        var answered: Int = 3

    }
}

enum class Level {
    EASY, MEDIUM, HARD
}

class QuestionAsk<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Level  // enum constant
)


// Extend classes with new properties and methods : 
// In compose, hen specifying the size of UI elements. Numeric types, such as Double, appear to have properties like dp and sp.
// "    padding(16.dp)   "

// Kotlin language does, is give other developers the ability to extend existing data types, adding properties and methods 
// that can be accessed with dot syntax, as if they were part of that data type

// Add an extension property : add the type name and a dot operator (.) before the variable name.

val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"

// Extension properties can't store data, so they must be get-only.


// Add an extension function : add the type name and a dot operator (.) before the function name.

// EX.:  You'll add an extension function to output the quiz progress as a progress bar. 
// Add an extension function to the StudentProgress object called printProgressBar().

fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }  // the progress bar represents the number of questions answered
    repeat(Quiz.total - Quiz.answered) { print("▒") }  // represents the remaining questions in the process bar.
    println()
    println(Quiz.progressText)
}

fun main() {

    println("${Quiz.answered} of ${Quiz.total} answered") // companion object
    println(Quiz.progressText)   // extension property
    Quiz.printProgressBar()      // extention function
}