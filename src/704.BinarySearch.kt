fun search (nums: IntArray, target: Int): Int {
    var left: Double = 0.0
    var right = nums.size.toDouble()
    var current: Double
    var currentIndex: Int

    if (nums.isEmpty()) {
        return -1
    }

    while (left <= right) {
        current = Math.floor((left + right).toDouble() / 2)
        currentIndex = current.toInt()

        if (currentIndex >= nums.size) {
            return -1
        }

        if (nums[currentIndex] == target) {
            return currentIndex
        } else if ( target > nums[currentIndex] ) {
            left = current + 1
        } else {
            right = current - 1
        }
    }

    return -1
}

fun main () {
    println(search(intArrayOf(-1, 0, 3, 5, 9, 10, 15), 9))
}