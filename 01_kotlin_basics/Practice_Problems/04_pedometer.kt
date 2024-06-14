// The pedometer is an electronic device that counts the number of steps taken.

fun main() {
    val steps = 4000
    val caloriesBurned = stepsToCalories(steps);
    println("Walking $steps steps burn $caloriesBurned calories")
}

fun stepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}