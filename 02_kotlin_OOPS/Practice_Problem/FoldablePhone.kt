// in contrast, if a foldable phone is folded, the main inner screen on a foldable phone doesn't
// turn on when the power button is pressed.

// write a FoldablePhone class that inherits from the Phone class. It should contain the following:

// A property that indicates whether the phone is folded.
// A different switchOn() function behavior than the Phone class so that it only turns the screen on
// when the phone isn't folded.
// Methods to change the folding state.

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun chechPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "On" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true): Phone() {
    
    override fun switchOn() {
        if (!isFolded) {
            super.switchOn()
            isScreenLightOn = true
        }
    }

    fun foldState() {
        isFolded = true
    }

    fun unfoldState() {
        isFolded = false
    }
}

fun main() {
    val foldablePhone = FoldablePhone()
    foldablePhone.switchOn()
    foldablePhone.chechPhoneScreenLight()
    foldablePhone.unfoldState()
    foldablePhone.switchOn()
    foldablePhone.chechPhoneScreenLight()
}


// The solution contains a FoldablePhone class with a default constructor that contains a default argument for the isFolded parameter.
// The FoldablePhone class also has two methods to change the isFolded property to either a true or false value. It also overrides the switchOn() method inherited from the Phone class