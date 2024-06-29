// Rewrite extention function using interfaces :

// If you need multiple classes to have the same additional properties and methods, perhaps with
// differing behavior,
// you can define these properties and methods with an interface.

// For example, in addition to quizzes, let's say you also have classes for surveys, steps in a
// recipe, or any other ordered data
// that could use a progress bar. You can define something called an interface that specifies the
// methods and/or properties that each of these classes must include.

// An interface is defined using the interface keyword,
// An interface is a contract. A class that conforms to an interface is said to extend the interface
// In return, the class must implement all properties and methods specified in the interface
// Interfaces allow for variation in the behavior of classes that extend them. It's up to each class
// to provide the implementation.

class Quizs : ProgressPrintable {
    val question1 = QuestionAnswer<String>("what is java", "Programming Language", Levels.MEDIUM)
    val question2 = QuestionAnswer<Boolean>("The sun is black. True or false", false, Levels.EASY)
    val question3 = QuestionAnswer<Int>("Cricket Team xi player ? ", 11, Levels.HARD)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    override val progressText: String // property comes from the interface
        get() = "${answered} of ${total} answered."

    override fun printProgressBar() { // interface methods implementation
        repeat(Quizs.answered) { print("▓") }
        repeat(Quizs.total - Quizs.answered) { print("▒") }
        println()
        println(progressText)
    }

    /// Scope functions
    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}

enum class Levels {
    EASY,
    MEDIUM,
    HARD
}

class QuestionAnswer<T>(
        val questionText: String,
        val answer: T,
        val difficulty: Levels // enum constant
)

// An interface :
// Add classes that conform to the same interface to reuse code without inheriting from a
// superclass.

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

// Ex.--- 1. Mocking for automated tests. Both the mock class and the real class conform to the same
// interface.
//        2. Manual dependency injection
//        3. Accessing the same dependencies in a COMPOSE MULTIplatform app
//        4. Several data types in Compose, such as Modifier, are interfaces.





// Use "scope function" to access class properties and methods : *************

// Scope functions are higher-order functions that allow you to access properties and methods of an
// object without referring to the object's name.
// These are called scope functions because the body of the function passed in takes on the scope of
// the object that the scope function is called with

// Replace long object names using let() :
// The let() function allows you to refer to an object in a lambda expression using the identifier
// it, instead of the object's actual name

// Try accessing the properties of question1, question2, and question3 using let():

// Add a function to the Quiz class named printQuiz(). to prints the questions




// Call an objects methods without a variable using apply() : **************

// the cool features of scope functions is that you can call them on an object before that object has even been assigned to a variable
// he apply() function is an extension function that can be called on an object using dot notation. 
// The apply() function also returns a reference to that object so that it can be stored in a variable.

fun main() {
    Quizs().printProgressBar() // interface methods call
    // val quiz = Quizs()
    // quiz.printQuiz() // scope function call

    // val quiz = Quizs().apply {   // "apply()" , use trailing lambda syntax
    //     printQuiz()  // scope function call ,
    //  }

    Quizs().apply {    // The apply() function return the instance of the Quizs class, So, remove the quiz variable.
        printQuiz()
     }
}
