package calculator

fun main() {
    val list = readln().split(" ").toList()
    println((list[0].toInt()+list[1].toInt()).toString())
}
