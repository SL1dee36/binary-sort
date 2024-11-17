// Вспомогательные функции для бинарного поиска

// Итеративный метод бинарного поиска
fun binarySearchIterative(arr: IntArray, target: Int): Int {
    var left = 0
    var right = arr.size - 1
    
    while (left <= right) {
        val mid = left + (right - left) / 2
        
        if (arr[mid] == target) {
            return mid  // Элемент найден
        }
        
        if (arr[mid] < target) {
            left = mid + 1  // Ищем в правой половине
        } else {
            right = mid - 1  // Ищем в левой половине
        }
    }
    
    return -1  // Элемент не найден
}

// Рекурсивный метод бинарного поиска
fun binarySearchRecursive(arr: IntArray, target: Int, left: Int = 0, right: Int = arr.size - 1): Int {
    if (left > right) return -1  // Элемент не найден
    
    val mid = left + (right - left) / 2
    
    if (arr[mid] == target) {
        return mid  // Элемент найден
    }
    
    return if (arr[mid] < target) {
        binarySearchRecursive(arr, target, mid + 1, right)  // Ищем в правой половине
    } else {
        binarySearchRecursive(arr, target, left, mid - 1)  // Ищем в левой половине
    }
}

// Пример использования

fun main() {
    val arr = intArrayOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21)
    val target = 15
    
    // Итеративный бинарный поиск
    val resultIterative = binarySearchIterative(arr, target)
    println("Итеративный метод: Элемент найден на индексе $resultIterative")
    
    // Рекурсивный бинарный поиск
    val resultRecursive = binarySearchRecursive(arr, target)
    println("Рекурсивный метод: Элемент найден на индексе $resultRecursive")
}
