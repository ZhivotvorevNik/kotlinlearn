fun summ(first:Int = 0, second:Int = 0):Int {
    return first + second;
}

//fun main() {
//    var input: String?
//    var first: Int
//    var second: Int
//
//    println("Введите 1 число:\n")
//    input = readLine();
//
//    if (input == null || input == "") {
//        first = 0
//    } else {
//        first = input.toInt()
//    }
//
//    println("Введите 2 число:\n")
//    input = readLine()
//
//    if (input == null || input == "") {
//        second = 0
//    } else {
//        second = input.toInt();
//    }
//
//    println("Сумма ${first} и ${second}: ${summ(first, second)}")
//
//}

//fun main() {
//    val first: Int = 153
//    val second: Int = 734
//
//    println("Сумма ${first} и ${second}: ${summ(first, second)}")
//}


//fun main() {
//
//    val x = 340;
//
//    println(if (x > 5) "x > 5, $x" else "x <= 5, $x")
//}

fun main() {

    val x = 3

    isMore5(x)
}

fun isMore5 (value: Int): Unit {
    if (value < 5) return
    println("$value >= 5")
}

fun calcChairs(bugs: Int = 0): Int {
    val bugsDouble: Double = bugs.toDouble();
    // enter your function code here
    return (bugsDouble + Math.floor(bugsDouble/2)).toInt()
}

fun calcBugMoneyValue(dayNumber: Int = 0, bugRank: Int = 0, cashAmount: Int = 0): Int {
//    val day: Int = Math.floor(dayNumber.toDouble() / 7).toInt()
//    if (dayNumber < 1 || dayNumber > 7) return 0

    return (dayNumber * bugRank + 42) * cashAmount;
    //enter your function implementation here
}