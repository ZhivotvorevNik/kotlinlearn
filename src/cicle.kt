fun main() {
    for_test()
}

fun when_value(value: Int) {
    when (value) {
        5 -> println("Пять")
        6 -> println("Шесть")
        7 -> println("Семь")
        8 -> println("Восемь")
        9 -> println("Девять")
        10 -> println("Десять")
        in 11..100 -> println("Больше 10")
        in 101..1000 -> println("Больше 100")
        else -> {
            if (value < 5) {
                println("Меньше пяти")
            } else {
                println("Больше тысячи")
            }
        }
    }
}

fun when_test(value: Int) {
    when {
        value < 5 -> println("Меньше пяти")
        value in 5..100 -> println("Больше 5")
        value in 101..1000 -> println("Больше 100")
        else -> println("Больше тысячи")
    }
}

fun do_while () {
    var iterator: Int = 5;
    while (iterator > 0) {
        println("Обратный отсчет: $iterator")
        iterator--
    }

    do {
        println("Вверх: $iterator")
        iterator++
    } while (iterator < 6)
}


fun for_test () {
    for (iterator in 0 .. 5) {
        println("in 0 .. 5: $iterator")
    }

    for (iterator in 0 .. 5 step 2) {
        println("in 0 .. 5 step 2: $iterator")
    }

    for (iterator in 5 downTo 0) {
        println("in 5 downTo 0 step: $iterator")
    }

    for (iterator in 5 downTo 0 step 2) {
        println("in 5 downTo 0 step 2: $iterator")
    }

    for (iterator in 0 until 5) {
        println("in 0 until 5: $iterator")
    }
}

//Жители системы Жука имеют достаточно высокую даже по галактическим меркам продолжительность жизни. Поэтому пришельцы были крайне удивлены тем, что 1) земляне зачем-то измеряют отрезки времени 2) как они их именуют. Это очень сильно осложняет культурный обмен. При попытках земного исследователя соотнести факты рассказанные пришельцем, последний непонимающе моргает всеми пятью глазами и устало берется за голову передней лапкой. Поэтому, земляне придумали упрощенную систему летоисчисления специально для гостей с далеких звезд.
//
//Реализуйте функцию getYearEra, которая для введенного в качестве аргумента функции года возвращает один из возможных вариантов его положения относительно даты начала Unix-эры (1970 год) в виде строки:
//
//before
//equals
//after (XX century)
//after (XXI century)
//distant future
//Например:
//
//2712  -> "distant future"
//1971  -> "after (XX century)"
fun getYearEra(year: Int): String{
    when (year) {
        1970 -> return "equals"
        in 1971 .. 2000 -> return "after (XX century)"
        in 2001 .. 2100 -> return "after (XXI century)"
        else -> {
            if (year < 1970) return "before"
            else return "distant future"
        }
    }
}