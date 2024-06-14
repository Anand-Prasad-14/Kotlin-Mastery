// Implement basic math operations

fun main() {
    val num1 = 10
    val num2 = 5
    val addition = num1 + num2
    println("$num1 + $num2 = $addition")

    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    val subtractTotal = subtract(firstNumber, thirdNumber)
    println("$firstNumber - $thirdNumber = $subtractTotal")

}

// Make a reusable function to add two numbers
fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

// Make a reusable function to subtract two number
fun subtract(firstNumber: Int, thirdNumber: Int): Int {
    return firstNumber - thirdNumber
}