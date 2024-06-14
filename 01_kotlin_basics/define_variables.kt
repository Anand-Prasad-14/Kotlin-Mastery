
fun main() {

    // Variable declaration

    val count: Int = 2 // If intial value is not assigned for variable, then it's necessory to include data type  
    // val count = 2  // type inference will automatically figure out data type
    println(count)
    println("You have $count unread messages.")
    
    // Basic math operation
    val unreadCount = 5
    val readCount = 10
    println("You have ${unreadCount + readCount} total messages in your indbox.")

    // Update variables

    val cartTotal = 0
    // cartTotal = 20
    println("Total: $cartTotal") // ERROR: Val cannot be reassigned

    var scoreTotal = 120
    scoreTotal = 200
    println("Total: $scoreTotal") // updated value

    // Increment operators

    var marks = 10
    println(marks)
    // marks = marks + 1
    marks++ // use this for better readibility
    println("You have $marks marks in english subject")

    // Decrement operator
    marks--
    println("You have $marks marks in english subject")


    //Double data type
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength: Double = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

    // String data type
    val nextMeeting = "Next meeting: "
    val date = "May 14"
    // val reminder = nextMeeting + date // concatenation
    val reminder = nextMeeting + date + " at Anand Home"
    println(reminder)

    println("Say \"hello\"")

    // Boolean operator
    val notificationEnabled: Boolean = true
    println("Are notifications enabled? " + notificationEnabled)


}