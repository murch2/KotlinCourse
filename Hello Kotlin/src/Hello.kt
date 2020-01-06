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
    println("Today is $day and the fish eat $food")
}

fun main(args: Array<String>) {
    feedTheFish()
}