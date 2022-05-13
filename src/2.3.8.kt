class SugarStorage(initialVolume: Int = 0) {
    public var volume: Int = 0
    init {
        volume = if (initialVolume < 0) 0 else initialVolume
    }
    public fun increaseSugar (v: Int) {
        if (v < 0) return
        volume += v
    }
    public fun decreaseSugar (v: Int) {
        if (v < 0) return
        volume = if (v > volume) 0 else volume - v
    }
}

fun main() {
    val storage: SugarStorage = SugarStorage(5)
    println(storage.volume)
    storage.decreaseSugar(3)
    println("2 = ${storage.volume}")
    storage.decreaseSugar(8)
    println("0 = ${storage.volume}")
    storage.increaseSugar(7)
    println("7 = ${storage.volume}")
    storage.decreaseSugar(-5)
    println("7 = ${storage.volume}")
    storage.increaseSugar(-5)
    println("7 = ${storage.volume}")
}