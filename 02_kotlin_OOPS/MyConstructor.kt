// Primary Constructor has two type: 


// class SmartDevice constructor() {   // Default constructor

// }

class MobilePhone(val name: String, val category: String) {   // Parameterized constructor
    
    var deviceStatus = "online"

    fun turnOn() {
        println("SmartPhone is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}

fun main() {

    val smartDevice = MobilePhone("SAMSUNG24+", "Flagship") // constructor instantiate the object
    println(smartDevice.name) 
}