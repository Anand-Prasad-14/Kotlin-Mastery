// In kotlin, all classes are final by default

//parent class or super class
open class SmartAppliance(val name: String, val category: String) {  // add an open keyword bafore the class to make it extendible:
    
    val devieStatus = "online"

    fun turnOn(){
        println("Smart device $name is turned on.")
    }

    fun turnOff(){
        println("Smart device $name is turned off.")
    }  
}

// SmartTvDevice(childclass) subclass that extends the SmartAppliance superclass: 
class SmartTvDevice(deviceName: String, deviceCategory: String) : SmartAppliance(name = deviceName, category = deviceCategory) {
    
    var speakerVolume = 2
    set(value) {
       if (value in 0..100) {
           field = value
       }
    }

    var channelNumber = 1
    set(value) {
        if (value in 0..200) {
            field = value
        }
    }

    fun increaseSpeakerVol() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume .")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber .")
    }
}

//SmartLightDevice subclass that extends the SmartAppliance superclass: 
class SmartLightDevice(deviceName: String, deviceCategory: String) : SmartAppliance(name = deviceName, category = deviceCategory) {
    
    var brightnesslevel = 0
    set(value) {
        if (value in 0..100){
            field = value
        }
    }

    fun increaseBrightness(){
        brightnesslevel++
        println("Brightness increased to $brightnesslevel .")
    }
}

// ***************** Relationship between classes ***************** //

// # IS-A reltionships is unidirectional

// Smart TV IS-A smart Appliance.
// class SmartTvDevice : SmartAppliance() {
// }
// Here, SmartTvDevice class inherits the SmartAppliance superclass

// # HAS-A relationships is also referred to as composition.

// // The SmartHome class HAS-A smart TV device.
// class SmartHome(val smartTvDevice: SmartTvDevice) {
// }
// Here, SmartHome class contains a SmartTvDevice subclass.

// The SmartHome class HAS-A smart TV device and smart light.
class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {
    
    fun turnOnTv(){
        smartTvDevice.turnOn() // here, SmartHome class can access the methods of SmartAppliance superclass.
    }

    fun turnOffTv() {
        smartTvDevice.turnOff()
    }

    fun increaseTvVol() {
        smartTvDevice.increaseSpeakerVol()
    }

    fun changeTvChannelNext(){
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOfAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}


fun main() {
    val smartDevice = SmartTvDevice("SONY TV", "Smart TV")
    smartDevice.increaseSpeakerVol()
    smartDevice.turnOn()

    val smartlight = SmartLightDevice("Philips", "LED Light")
    smartlight.increaseBrightness()

    val smartHome = SmartHome(smartDevice, smartlight)
    smartHome.turnOnTv()
    smartHome.turnOnLight()
    smartHome.turnOfAllDevices()
    smartHome.changeTvChannelNext()
}