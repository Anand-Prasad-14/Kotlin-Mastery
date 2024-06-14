// Gmail has a feature to sends notification to user whenever login attempt is made on new device.
// Write a program that displays a message to users.

fun main() {
    val operatingSystem = "Linux"
    val emailId = "linux@gmail.com"

    // println(displayAlertMessage(operatingSystem, emailId))
    println(displayAlertMessage(emailId = emailId))

}

// fun displayAlertMessage(operatingSystem: String, emailId: String): String {
//     return "There is a new sign-in request on $operatingSystem for your Google Account $emailId"
// }

//default parameter

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}