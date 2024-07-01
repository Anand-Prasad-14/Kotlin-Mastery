
// ****   TASK 1 : **** : 

// You need to implement the Event class. This class is used to hold the details of the event entered by the user. 

// An instance of this class should be able to store the:

// Event title as a string.
// Event description as a string (can be null).
// Event daypart as a string. We only need to track if the event starts in the morning, afternoon, or evening.
// Event duration in minutes as an integer.

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)

// **** TASK 2 **** : 

// The senior teammate realizes that using a string for the daypart is not ideal. 
// Some developers stored the value of "Morning", some used "morning", and still others used "MORNING".
// This caused many problems.

// Your task is to fix this issue by doing some refactoring. 
// Refactoring is the process of improving your code without changing it's functionality. 

// Use an enum class, to change the daypart code  :

// The enum class should be named " Daypart ". it should have three values : 
   // MORINING
   // AFTERNOON
   // EVENING

   enum class Daypart {
       MORNING,
       AFTERNOON,
       EVENING
   }


// **** TASK 3 **** : 

// As more event are created, it becomes more difficult to keep track of them all. 
// Because each event currently requires its own variable. 

// Can you think of better way to organize the storage of these events? 
// What way can you store all the events in one variable? 
// NOTE: It has to be flexible, as more events may be added. 
// It also needs to return the count of the number of the events stored in the variable. 



// **** TASK 4 **** : 

// User should be able to see a summary of their short events, based on the event's duration. 
// EX-: "You have 5 short events." 

// A "short" event is an event that is less than 60 minutes. 
// Using the `events` variable code, how would you achieve this result?


//  **** TASK 5 **** : 

// users to be able to see a summary of all the events and their daypart.
// The output should be similar to:
   // Morning: 3 events
   // Afternoon: 4 events
   // Evening: 2 events
// Using the events variable, how can you achieve this result? 




// **** TASK 6 **** : 

// Prints the last item by using its index. 
// ` println("Last event of the day: ${events[events.size - 1].title}") `
// What function did you find?

// ***** TASK 7 **** : 

// Your team likes the data class you designed, but finds it repetitive to write code each time they need an event's duration as a string:
// Without directly changing the data class, how can you write an extension property that returns the same values as the code above?
// Print the message as the code - `println("Duration of first event of the day: ${events[0].durationOfEvent}") `
val Event.durationOfEvent: String
        get() = if (this.durationInMinutes < 60) {
            "short"
        } else {
            "long"
        }



fun main() {
    // val event1 = Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day", Daypart.MORNING, 15)
    // println("Event 1: $event1")

    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 25)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)  // TASK 3 solution

    val shortEvent = events.filter {    // TASK 4 solution
        it.durationInMinutes < 60
     }
    val totalShortEvent = shortEvent.count()
    println("You have $totalShortEvent short events.")

    val groupedEvents = events.groupBy { // TASK 5 solution
        it.daypart
     }
    groupedEvents.forEach { (daypart, events) -> 
      println(" $daypart: ${events.size} events")
    }
    
    println("Last event of the day: ${events.last().title}")   // TASK 6 solution

    
    println("Duration of first event of the day: ${events[0].durationOfEvent}")    // TASK 7 solution
}

