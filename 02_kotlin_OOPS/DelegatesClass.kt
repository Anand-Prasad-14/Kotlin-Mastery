// Define property delegates

// Properties uses a backing field to hold their values in memory. You use the field identifier to
// reference it.

// You can reuse the range-check code in the setter function with delegates.
//  Instead of using a field, and a getter and setter function to manage the value, the delegate
// manages it.

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

// RangeRegulator class that implements the ReadWriteProperty<Any?, Int> interface:
class RangeRegulator(initialValue: Int, private val minValue: Int, private val maxValue: Int) :
        ReadWriteProperty<Any?, Int> { // They represent the generic types

    var fieldData = initialValue // This property act as the backing field for the variable.

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    //   These methods act as the properties' getter and setter funcions.

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        } else {
            throw IllegalArgumentException("Value should be between $minValue and $maxValue")
        }
    }
}

open class SmartCar(val name: String, val model: String) {
    val carStatus = "Start"

    // create property delegates starts with the declaration of a variable followed by the by
    // keyword,
    // and the delegate object that handles the getter and setter functions for the property.

    private var speed by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 120)

    fun start() {
        println("Smart Car $name is Running.")
    }

    fun stop() {
        println("Smart Car $name is stopped.")
    }

    fun carSpeed() {
        speed++
        println("Smart Car $name speed is $speed.")
    }

    open fun turnOn() {
        println("Smart device is turned on.")
    }

    open fun turnOff() {
        println("Smart device is turned off.")
    }

    inner class FuelIndicator() {

        var fuelLevel = 0
            set(value) {
                if (value in 0..100) {
                    field = value
                }
            }

        fun increaseFuelLevel() {
            fuelLevel++
            println("Fuel level increased to $fuelLevel.")
        }
    }
}

class MonitorTv(deviceName: String, deviceCategory: String) :
        SmartCar(name = deviceName, model = deviceCategory) {

    // MonitorTv class use the delegates class to define the properties ranges.
    private var speakerVolume by RangeRegulator(initialValue = 30, minValue = 0, maxValue = 120)

    private var channelNumber by RangeRegulator(2, 1, 200)

    fun increaseSpeakerVol() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume .")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber .")
    }

    override fun turnOn() {
        super.turnOn()
        println(
                "TV is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                        "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("TV turned off.")
    }
}

fun main() {
    val smartCar = SmartCar("TATA", "Safari")
    smartCar.start()
    smartCar.FuelIndicator().increaseFuelLevel()
    smartCar.stop()

    val smartTv = MonitorTv("SAMSUNG", "LED Monitor")
    smartTv.turnOn()
    smartTv.nextChannel()
    smartTv.increaseSpeakerVol()
    smartTv.turnOff()
}
