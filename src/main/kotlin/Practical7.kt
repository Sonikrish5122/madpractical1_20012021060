
//by Recursion  Method
fun main(args: Array<String>) {
    print("Enter number: ")
    val number: Int = Integer.valueOf(readLine())
    val factorial = fact(number)
    println("Factorial of $number = $factorial")

}
fun fact(x: Int): Int {
    var result = x
    for (i in x - 1 downTo 1) {
        result *= i
    }
    return result
}
