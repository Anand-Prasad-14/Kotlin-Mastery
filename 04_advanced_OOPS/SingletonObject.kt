// Singleton object : 

// A singleton is a class that can only have a single instance. 
// Kotlin provides a special constructs, called an object, that can be used to make a singleton class.

// EXAMPLE:  Authentication, where only one user should be logged in at a time.

// For a quiz, it would be great to have a way to keep track of the total number of questions, 
// and the number of questions the student answered so far. You'll only need one instance of this class to exist,

object StudentProgress {              // Use " object " keyword, to create a singleton class
    var total: Int = 10
    var answered: Int = 3
}


// Access a singleton object :

// You can't create an instance of a singleton object directly ?
// Because there's only one instance of StudentProgress in existence at one time. 

fun main() {
    println("${StudentProgress.answered} of ${StudentProgress.total} answered.")
}