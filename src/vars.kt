fun main() {
    var str:String = "5";
    var number:Int = 7;

    println(7 + str.toInt())

    println(7 + str.toFloat())
    println(7 + str.toDouble())
    println(7 + str.toShort())
    println(number.toString() + str)

    println("Шаблон: ${str}")

    println("\n")
    println("Введите что-то: ")

    val answer:String? = readLine()

    println("Вы ввели: ${answer}")
}