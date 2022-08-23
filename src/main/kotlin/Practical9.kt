fun main() {
    val numberArray: IntArray = intArrayOf(120, 250, 450, 400, 50)
    var largestElement = numberArray[0]
    for (n in numberArray) {
        if (largestElement < n)
            largestElement = n
    }
    println("The largest element in the array is %d".format(largestElement))
}