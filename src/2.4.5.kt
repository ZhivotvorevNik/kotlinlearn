fun getCubeList (n: Int): List<Int> {
    return List<Int>(n) { it * it * it }
}

fun main() {
    println(getCubeList(10))
}