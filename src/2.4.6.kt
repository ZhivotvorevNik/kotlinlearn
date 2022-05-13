fun calculateWordStat(input:String): String{
    val map:HashMap<String, Int> = hashMapOf()
    val strings:Array<String> = input.split(" ").toTypedArray()

    strings.forEach { key ->

//        map[key]?.let {
//            map.put(key, it + 1)
//        }
//        if (map[key] == null) {
//            map.put(key, 1)
//        }

        map[key]?.let {
            map.put(key, it + 1)
        }
        if (map[key] == null) {
            map.put(key, 1)
        }

//        val count = map.getValue(it)
//        map += it to count + 1
    }

    return ""
// enter your function code here
}

fun main() {
    println(calculateWordStat("PDDPEM MXWHL XJID XJID XJID DTQEHGC DTQEHGC MXWHL XJID DTQEHGC DTQEHGC MXWHL PDDPEM QUCO DTQEHGC MXWHL DTQEHGC MXWHL PDDPEM XJID MXWHL DTQEHGC DTQEHGC XJID XJID XJID MXWHL MXWHL MXWHL MXWHL DTQEHGC PDDPEM DTQEHGC DTQEHGC PDDPEM"))
}