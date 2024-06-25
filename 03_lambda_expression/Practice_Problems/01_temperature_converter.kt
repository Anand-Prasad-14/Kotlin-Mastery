// write a program that converts a temperature from one scale to another with these formulas:

// Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
// Kelvin to Celsius: ° C = K - 273.15
// Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15

// Note that the String.format("%.2f", /* measurement */ ) method is used to convert a number into a String type with 2 decimal places.

fun main() {
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
){
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

// The solution requires you to pass a function as a parameter to the printFinalTemperature() function.
// The most succinct solution passes lambda expressions as the arguments, uses the it parameter reference in place of the parameter names,
// and makes use of trailing lambda syntax.