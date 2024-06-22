// Method Overriding

// Visibility modifiers for constructors and classes.
// Visibility modifiers play an important role in the achievement of encapsulation.

open class SmartElectronic protected constructor (val name: String, val category: String) {  // add an open keyword bafore the class to make it extendible:
    
    // Use "private" keyword to make the deviceStatus property private, which is accessible within class. 
    // private var deviceStatus = "online"
    var deviceStatus = "online"
                protected set(value) {
                    field = value
                }

    open val deviceType = "unknown"

     // add open keyword to make it extendible : 
    open fun turnOn(){
        println("Smart device $name is turned on.")
        deviceStatus = "on"
    }

    open fun turnOff(){
        println("Smart device $name is turned off.")
        deviceStatus = "off"
    }  
}

// SmartTv(childclass) subclass that extends the SmartElectronic superclass: 
class SmartTv(deviceName: String, deviceCategory: String) : SmartElectronic(name = deviceName, category = deviceCategory) {
    
    // Override superclass properties from subclasses
    override val deviceType = "Smart TV"

    // Use 'private' modifier, to the properties to be controlled within the class and can't controlled from outside the class.
    private var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    private var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    fun increaseSpeakerVol() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume .")
    }

    protected fun nextChannel() { // Visibility modifiers for methods
        channelNumber++
        println("Channel number increased to $channelNumber .")
    }
    
    // Use the "super" keyword, which informs the kotlin compiler to call the methods from the superclass in the subclass.
    override fun turnOn() {
        // deviceStatus = "on"
        super.turnOn()
        println("$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                "set to $channelNumber.")
    }

    override fun turnOff() {
        // deviceStatus = "off" 
        super.turnOff()
        println("$name turned off.")
    }
}

//SmartLight subclass that extends the SmartElectronic superclass: 
class SmartLight(deviceName: String, deviceCategory: String) : SmartElectronic(name = deviceName, category = deviceCategory) {
    
    override val deviceType = "Smart Light"

    private var brightnesslevel = 0
        set(value) {
            if (value in 0..100){
                field = value
            }
        }

    fun increaseBrightness(){
        brightnesslevel++
        println("Brightness increased to $brightnesslevel .")
    }

    // The "override" keyword inform the kotlin runtime to execute the code enclosed in the method defined in the subclass.

    override fun turnOn() {
        // deviceStatus = "on"
        super.turnOn()
        brightnesslevel = 2
        println("$name turned on. The brightness level is $brightnesslevel.")
    }

    override fun turnOff() {
        // deviceStatus = "off"
        super.turnOff()
        brightnesslevel = 0
        println("Smart Light turnrd off")
    }
}

//SmartPhone subclass that extends the SmartElectronic superclass:

class SmartPhone(
    val smartTvDevice: SmartTv,
    val smartLightDevice: SmartLight,
    ) {
    
    var deviceTurnOnCount = 0
        private set

    fun turnOnTv(){
        deviceTurnOnCount++
        smartTvDevice.turnOn() // here, SmartHome class can access the methods of SmartElectronic superclass.
    }

    fun turnOffTv(){
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun turnOnLight(){
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight(){
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }
}


fun main() {

    val smartDevice : SmartElectronic = SmartTv("Samsung Neo", "4K TV")
    smartDevice.turnOn()

    val smartlight : SmartElectronic = SmartLight("Philips", "LED Light")
    smartlight.turnOff()
  
}