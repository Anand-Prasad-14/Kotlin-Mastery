// The message should include:

// 1. The exact number of notifications when there are less than 100 notifications.
// 2. 99+ as the number of notifications when there are 100 notifications or more.

fun printNotificationSummary(numberOfMessage: Int) {
    
    if (numberOfMessage < 100) {
        println("You have $numberOfMessage notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}

fun main() {
    val moriningNotification = 51
    val eveningNotification = 150

    printNotificationSummary(moriningNotification)
    printNotificationSummary(eveningNotification)
}