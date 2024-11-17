fun binarySort(n: Int, arr: IntArray) {
    var left = 0
    var right = n - 1
    val swaps = mutableListOf<Pair<Int, Int>>()

    while (left < right) {
        while (left < n && arr[left] == 0) {
            left++
        }
        while (right >= 0 && arr[right] == 1) {
            right--
        }

        if (left < right) {
            val temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp
            swaps.add(Pair(left, right))
            left++
            right--
        }
    }

    println(swaps.size)
    for (swap in swaps) {
        println("${swap.first} ${swap.second}")
    }
}

fun main() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    binarySort(n, arr)
}
