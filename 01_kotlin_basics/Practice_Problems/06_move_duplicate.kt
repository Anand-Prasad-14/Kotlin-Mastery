//Call the printWeatherForCity() function with the weather details for the other cities.

fun main() {
    printWeatherForCity("Mumbai", 27, 31, 82)
    printWeatherForCity("Delhi", 32, 36, 10)
    printWeatherForCity("Banglore", 59, 64, 2)
    printWeatherForCity("Pune", 50, 55, 7)
}

fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}