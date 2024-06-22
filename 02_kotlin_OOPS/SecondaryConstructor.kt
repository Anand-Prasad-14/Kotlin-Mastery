// Secondary Constructor

class SmartWatch(val name: String, val category: String) {
    var deviceStatus = "online"
    
    // The API returns 0 value if device is offline and 1 value if device is online, otherwise the status is considered unknown.
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when(statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
}

fun main() {
    val smartDevice = SmartWatch("Apple Watch", "Fitness&Health", 0)
    println(smartDevice.deviceStatus)
}