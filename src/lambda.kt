fun filter(arr: Array<Int>, lambda: (first: Int) -> Boolean): Array<Int> {
    val list:MutableList<Int> = mutableListOf()
    for (current in arr) {
        if (lambda(current)) {
            list.add(current)
        }
    }
    return list.toTypedArray()
}

fun main() {
//    val compareMore5 = { value: Int -> value > 5 }
    println("filter > 5 возвращает ${filter(arrayOf(5, 7, 0 , 2, 6, 15, 13), { value: Int -> value > 5 })}")
}