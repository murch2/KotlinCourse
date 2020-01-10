import java.util.*

fun fishFood(day: String): String {
    return when(day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        else -> "nothing"
    }
}

fun getRandomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun feedTheFish() {
    val day = getRandomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

// A good practice is to put parameters without default BEFORE parameters with default AFTER
fun swim(name: String, speed: String = "fast") {
    println("The fish called $name are swimming $speed")
}

//Compact Functions
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isSunday(day) -> true
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        else -> false
    }
}

fun main(args: Array<String>) {
    feedTheFish()
}

//More Examples (Using just for future studying)
fun getDirtyLevel(): Int {
    return Random().nextInt(50)
}

//It's not good call a function as default value of another function if the function that
//makes a large operation
fun shouldChangeWater2(day: String, temperature: Int, dirty: Int = getDirtyLevel()) {

}