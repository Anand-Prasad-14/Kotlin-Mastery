fun main(){
    val smartTvDevice = SmartDevice()
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}

class SmartDevice {

    val name = "Android TV"
    val category = "Entertainment"
    val devieStatus = "online"

    fun turnOn(){
        println("Smart device is turned on.")
    }

    fun turnOff(){
        println("Smart device is turned off.")
    }  
    
    // Getter and setter functions in properties
    var speakerVolume = 2
        get() = field     // To read the property value
        set(value) {      // To update the value
            field = value
            println("Speaker volume is set to $value")
        }
}