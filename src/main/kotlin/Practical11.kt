fun main() {
    val rows = 2
    val columns = 3
    val firstMatrix = arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4), intArrayOf(1, 1, 6))
    val secondMatrix = arrayOf(intArrayOf(2, 10, 5), intArrayOf(9, 4, 7), intArrayOf(2, 5, 7))
    val sum = Array(rows) { IntArray(columns) }
    for (i in 0..rows - 1) {
        for (j in 0..columns - 1) {
            sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]
        }
    }
    println("Sum of two matrices is: ")
    for (row in sum) {
        for (column in row) {
            print("$column ")
        }
        println()
    }
    val sum1 = Array(rows) { IntArray(columns) }
    for (i in 0..rows - 1) {
        for (j in 0..columns - 1) {
            sum[i][j] = firstMatrix[i][j] - secondMatrix[i][j]
        }
    }
    println("Sub of two matrices is: ")
    for (row in sum) {
        for (column in row) {
            print("$column ")
        }
        println()
    }
    val r1 = 2
    val c1 = 3
    val r2 = 3
    val c2 = 2
    val product = Array(r1) { IntArray(c2) }
    for (i in 0..r1 - 1) {
        for (j in 0..c2 - 1) {
            for (k in 0..c1 - 1) {
                product[i][j] += firstMatrix[i][k] * secondMatrix[k][j]
            }
        }
    }
    println("Product of two matrices is: ")
    for (row in product) {
        for (column in row) {
            print("$column ")
        }
        println()
    }
}

