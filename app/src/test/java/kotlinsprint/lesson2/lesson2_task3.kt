package kotlinsprint.lesson2

fun main() {
    val startHour = 9
    val startMin = 39
    val travelTime = 457
    //найдем время прибытия в минутах
    val finish = startHour * 60 + startMin + travelTime
    // Переведем время прибытия  в часы и минуты
    val finishHour = finish / 60
    val finishMin = finish - finishHour * 60
    println("Время прибытия: $finishHour:$finishMin")
}