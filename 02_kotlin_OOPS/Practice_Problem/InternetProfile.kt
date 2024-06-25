// write a program which prints out a person's profile details.

// you can add your personal information and link to other people who referred you to sign up for
// the profile.

fun main() {
    val anand = Person("Anand", 23, "Do coding", null)
    val rohit = Person("Rohit", 36, "Playing Cricket", anand)
    anand.showProfile()
    rohit.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {

    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) {
            println("Likes to $hobby.")
        }

        if (referrer != null) {
            print("Has a referrer named ${referrer.name}")
            if (referrer.hobby != null) {
                println(" and likes to ${referrer.hobby}.")
            } else {
                print(".")
            }
        } else {
            print("Doesn't have a referrer.")
        }

        print("\n\n")
    }
}

// The solution contains null checks in various if/else statements to print different text based on whether various class properties are null:
